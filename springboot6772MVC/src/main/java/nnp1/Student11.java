package nnp1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student11 
{
   @Id
   
	int stuId;
	
   @Column
	String name;
	
   @ManyToOne
   Class1 class1;

public int getStuId() {
	return stuId;
}

public void setStuId(int stuId) {
	this.stuId = stuId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Class1 getClass1() {
	return class1;
}

public void setClass1(Class1 class1) {
	this.class1 = class1;
}

@Override
public String toString() {
	return "Student11 [stuId=" + stuId + ", name=" + name + ", class1=" + class1 + "]";
}
   

	
}
