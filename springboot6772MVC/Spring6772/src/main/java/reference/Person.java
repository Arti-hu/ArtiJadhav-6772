package reference;

public class Person 
{
  private int pid;
  private String name;
  private String phone;
  
  private Address address;

public int getPid() {
	return pid;
}

public void setPid(int pid) {
	this.pid = pid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public Person(int pid, String name, String phone, Address address) {
	super();
	this.pid = pid;
	this.name = name;
	this.phone = phone;
	this.address = address;
}

public Person() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Person [pid=" + pid + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
}
  
  
  
}
