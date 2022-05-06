package com.springboot6772.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot6772.entity.Contact;
import com.springboot6772.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>
{
//	@Query("select u from User where u.userName=:userName")
//	public User getUserByUserName(@Param("userName") String userName);
//	
   public User findByuserNameAndPassword(String userName,String password);
	
  //public User getUserByUserName(String userName);

   public User getById(int userId);

}




