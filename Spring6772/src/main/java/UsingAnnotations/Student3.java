package UsingAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student3 
{
  int stuId;
  String name;
  String education;
  
public int getStuId() {
	return stuId;
}
public void setStuId(int stuId) {
	this.stuId = stuId;
}
public String getName() 
{
	
	return name;
	
}
public void setName(String name) 
{
	this.name = name;
	System.out.println("This is a setter method");
}
public String getEducation() {
	return education;
}
public void setEducation(String education) {
	this.education = education;
}
public Student3() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student3 [stuId=" + stuId + ", name=" + name + ", education=" + education + "]";
}
 
@PostConstruct
 public void init()
 {
	   System.out.println("This is my init method");
 }
@PreDestroy
public void destroy()
{
	System.out.println("This is destroy method");
}
  
}
