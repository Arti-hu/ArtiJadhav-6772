package collection;
import java.util.*;
public class Employee 
{
   private int eid;
   private String name;
   private List<String>project;
   private Set<String>mobile;
   private Map<Integer,String>email;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getProject() {
	return project;
}
public void setProject(List<String> project) {
	this.project = project;
}
public Set<String> getMobile() {
	return mobile;
}
public void setMobile(Set<String> mobile) {
	this.mobile = mobile;
}
public Map<Integer, String> getEmail() {
	return email;
}
public void setEmail(Map<Integer, String> email) {
	this.email = email;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", name=" + name + ", project=" + project + ", mobile=" + mobile + ", email="
			+ email + "]";
}
public Employee(int eid, String name, List<String> project, Set<String> mobile, Map<Integer, String> email) {
	super();
	this.eid = eid;
	this.name = name;
	this.project = project;
	this.mobile = mobile;
	this.email = email;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
   
   
   
   
   
}
