package com.springboot6772.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.Principal;
import java.io.File;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springboot6772.entity.Contact;
import com.springboot6772.entity.User;
import com.springboot6772.repository.ContactRepo;
import com.springboot6772.repository.UserRepo;
import com.springboot6772.service.ContactService;
import com.springboot6772.service.userService;

import java.util.*;

@Controller

public class UserController 
{
	@Autowired
	userService userservice;

	@Autowired
	ContactService contactservice;

	@Autowired
	UserRepo userRepo;
	
	@Autowired
	ContactRepo contactRepo;
	
	@GetMapping("/home")
	public String home()
	{
		return "user/home";
	}

	/*
	 * @ModelAttribute public void addCommonData(User user,Model m) { String
	 * userName=user.getUserName(); System.out.println("USERNAME "+userName);
	 * 
	 * User user1=userservice.getUserByUserName(userName);
	 * System.out.println("USER "+user1); m.addAttribute("user1", user1); }
	 */

	@GetMapping("/addcontact")
	public String addContact(Model model) 
	{
		model.addAttribute("title","Smart Contact Manager");
		model.addAttribute("contact", new Contact());
		return  "user/addcontact"; }

	//@PostMapping("/add_contact{user1}")
	@PostMapping("/add_contact")
	//@ResponseBody
	public String add_contact(@ModelAttribute Contact contact,
			@RequestParam("person_Image")  MultipartFile file,Model model,HttpSession session)throws IOException
	{
		
			if(file.isEmpty())
			{

				System.out.println("File is empty");
				
			}
			else
			{
				System.out.println("-----------------------------message 2");
				contact.setPersonImage(file.getOriginalFilename());
				File saveFile= new ClassPathResource("static/img").getFile();
				Path path=Paths.get(saveFile.getAbsolutePath()+File.separator+file.getOriginalFilename());
				Files.copy(file.getInputStream(), path,StandardCopyOption.REPLACE_EXISTING);
				System.out.println("File is uploaded");
				
			}
			
			this.contactservice.addContact(contact);
			
			System.out.println("added to database");
			session.setAttribute("message1", new Message("Contact added successfully","alert-success"));
		
			
			return "user/addcontact";
			
		}
	

	@GetMapping("/viewContacts")
	public String viewContacts(Model model)
	{
		List<Contact> contactDetails=this.contactservice.getAllContacts();
		model.addAttribute("contactObj",contactDetails);
		return "user/ViewContacts";
	}

	@ExceptionHandler(MaxUploadSizeExceededException.class)
	public String handleFileUploadError(RedirectAttributes ra,HttpSession session)
	{
		System.out.println("Caught file upload error");
		ra.addFlashAttribute("alert-danger", "File size is greater than 1MB");
		session.setAttribute("message", new Message("File size is greater than 1MB","alert-danger"));
		return "user/addcontact";
	}

	
//	@GetMapping("/contact/edit/{contactId}")
//	public String editContact(@PathVariable int contactId,Model model)
//	{
//		model.addAttribute("contacts", contactservice.getContactById(contactId));
//		
//		return "user/editContact";
//		
//	}
//	
//	@PostMapping("/contact/{contactId}")
//	public String updateContact(@PathVariable int contactId,@ModelAttribute("contacts") Contact contact,Model model)
//	{
//		//get contact data by id
//		Contact contact1= contactservice.getContactById(contactId);
//		contact1.setContactId(contactId);
//		contact1.setPersonName(contact.getPersonName());
//		contact1.setNickName(contact.getNickName());
//		contact1.setMobileNo(contact.getMobileNo());
//		contact1.setPersonEmail(contact.getPersonEmail());
//		contact1.setPersonWork(contact.getPersonWork());
//		contact1.setPersonDescription(contact.getPersonDescription());
//		contact1.setPersonImage(contact.getPersonImage());
//		
//		//save updated object
//		contactservice.updateContact(contact1);
//		return "user/ViewContacts";
//		
//		
//	}
//    
	
	
	@GetMapping("/showUpdateForm{contactId}")
	public String updateContact(@PathVariable(value="contactId") int contactId,Model model) 
	{
		
		
		//get contact from service
		Contact contact=contactservice.getContactById(contactId);
		model.addAttribute("contact", contact);
	
		
		
		return "user/editContact";
	}
	
	@PostMapping("/saveUpdateContact{contactId}")
	public String update_Contact(@ModelAttribute Contact contact,@PathVariable("contactId") int contactId,@RequestParam("person_Image") MultipartFile file) throws IOException
	{
		//contact.setPersonImage(updatedImageName);
		//System.out.println("123------------------------------------"+updatedImageName);
		
		if(file.isEmpty())
		{

			System.out.println("File is empty");
			
		}
		else
		{
			System.out.println("-----------------------------message 2");
			contact.setPersonImage(file.getOriginalFilename());
			File saveFile= new ClassPathResource("static/img").getFile();
			Path path=Paths.get(saveFile.getAbsolutePath()+File.separator+file.getOriginalFilename());
			Files.copy(file.getInputStream(), path,StandardCopyOption.REPLACE_EXISTING);
			System.out.println("File is uploaded");
			
		}
		this.contactservice.updateContact(contact,contactId);
		return "redirect:/viewContacts";
	}
	
//	@DeleteMapping("/deleteContact")
//	public void deleteContact(@RequestParam Integer contactId)
//	{
//		contactservice.deleteContact(contactId);
//		
//	}
	
	@GetMapping("/deleteContact{contactId}")
	public String deleteContact(@PathVariable(value="contactId") int contactId)
	{
		System.out.println("1------"+contactId);
		
		this.contactservice.deleteContactById(contactId);
		
		return "redirect:/viewContacts";
		//return "login";
		
	}
	
	@GetMapping("/viewProfile")
	public String viewprofile()
	{
		return "user/viewProfile";
	}

	

}
