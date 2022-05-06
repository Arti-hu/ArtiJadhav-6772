package com.springboot6772.serviceimplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot6772.entity.Contact;
import com.springboot6772.repository.ContactRepo;
import com.springboot6772.service.ContactService;

@Service
public class ContactServiceImplementation implements ContactService
{
	@Autowired
	ContactRepo contactRepo;
	@Override
	public void addContact(Contact contact) 
	{
		this.contactRepo.save(contact);
		
	}

	@Override
	public List<Contact> getAllContacts()
	{
		
		return contactRepo.findAll();
	}

	
	@Override
	public void updateContact(Contact contact,int contactId) 
	{
		   Contact contactObj=contactRepo.findById(contactId).get();
		   
		   contactObj.setMobileNo(contact.getMobileNo());
		   contactObj.setNickName(contact.getNickName());
		   contactObj.setPersonDescription(contact.getPersonDescription());
		   contactObj.setPersonEmail(contact.getPersonEmail());
		   contactObj.setPersonImage(contact.getPersonImage());
		   contactObj.setPersonName(contact.getPersonName());
		   contactObj.setPersonWork(contact.getPersonWork());
		   this.contactRepo.save(contactObj);
		
	}

//	@Override
//	public Contact getContactById(Integer contactId)
//	{
//		
//		return contactRepo.findById(contactId).get();
//	}

	

	@Override
	public Contact getContactById(int contactId) 
	{
	    Optional<Contact> optional=contactRepo.findById(contactId);
	    Contact contact=null;
	    if(optional.isPresent())
	    {
	    	contact=optional.get();
	    }
	    else
	    {
	    	throw new RuntimeException("Contact not found");
	    }
		return contact;
	}

	@Override
	public void deleteContactById(int contactId) 
	{
		System.out.println("2------"+contactId);
		 Contact contact = this.contactRepo.findById(contactId).get();
		 if(contact!=null)
		 {
			 System.out.println("3------"+contactId);
			 this.contactRepo.delete(contact);
		 }
		 else
		 {
			 System.out.println("4------"+contactId);
		     System.out.println("Contact Id not present");
		 }
		
		
	}

	
		
		
	
	
	
	

}
