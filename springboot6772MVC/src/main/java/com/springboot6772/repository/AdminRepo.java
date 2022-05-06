package com.springboot6772.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot6772.entity.Admin;
@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer>
{
  public Admin findByadminNameAndPassword(String adminName,String password);
}
