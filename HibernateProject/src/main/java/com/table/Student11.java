package com.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Student11 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int rollno;
    @Column(nullable=false)
	private String sname;
	@Column
	private String education;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	
	@Override
	public String toString() {
		return "Student11 [rollno=" + rollno + ", sname=" + sname + ", education=" + education + "]";
	}
	
	
}
