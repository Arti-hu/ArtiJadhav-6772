package com.springboot6772.service;

import java.util.List;

import com.springboot6772.entity.Contact;

public interface ContactService 
{
  public void addContact(Contact contact);
  
  public List<Contact> getAllContacts();
  
 
  
  
   //update contact
  public Contact getContactById(int contactId);
  public void updateContact(Contact contact, int contactId);
  
  //delete contact
  
  public void deleteContactById(int contactId);
 
}
