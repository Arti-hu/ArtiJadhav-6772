package com.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	
   int rollno;
	
	@Column
   String name;
	
	@Column
   String email;
   
	@Column
	int age;
   
   

public int getRollno() 
{
	return rollno;
}
public void setRollno(int rollno) 
{
	this.rollno = rollno;
}
public String getName() 
{
	return name;
}
public void setName(String name)
{
	this.name = name;
}
public String getEmail()
{
	return email;
}
public void setEmail(String email) 
{
	this.email = email;
}
public int getAge(int age)
{
	return age;
}
public void setAge(int age)
{
	this.age=age;
}
public Student() 
{
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString()
{
	return "Student [rollno=" + rollno + ", name=" + name + ", email=" + email + ", age= "+age +"]";
}
   

   
   
}
