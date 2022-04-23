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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.springboot6772.entity.Contact;
import com.springboot6772.entity.User;
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
	
	@GetMapping("/home")
	public String home()
	{
		return "user/home";
	}
	
	  @ModelAttribute public void addCommonData(User user,Model m) {
	  String userName=user.getUserName();
	  System.out.println("USERNAME "+userName);
	  
	  User user1=userservice.getUserByUserName(userName);
	  System.out.println("USER "+user1); m.addAttribute("user1", user1);
	  }
	  
	  
	  @GetMapping("/addcontact")
	  public String addContact(Model model) 
	  {
	  model.addAttribute("title","Smart Contact Manager");
	  model.addAttribute("contact", new Contact());
	  return  "user/addcontact"; }
	 
	 @PostMapping("/add_contact")
      public String add_contact(@ModelAttribute Contact contact,@RequestParam("person_Image")  MultipartFile file,Model model,HttpSession session)throws IOException
      {
		 if(file.isEmpty())
		 {
			 System.out.println("File is empty");
		 }
		 else
		 {
			 contact.setPersonImage(file.getOriginalFilename());
			 File saveFile= new ClassPathResource("static/img").getFile();
			 Path path=Paths.get(saveFile.getAbsolutePath()+File.separator+file.getOriginalFilename());
			 Files.copy(file.getInputStream(), path,StandardCopyOption.REPLACE_EXISTING);
			 System.out.println("File is uploaded");
		 }
	    
		 this.contactservice.addContact(contact);
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
	 
}
