package com.springboot6772.repository;

import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot6772.entity.Contact;
import com.springboot6772.entity.User;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

public interface ContactRepo extends JpaRepository<Contact, Integer>
{
  
}
