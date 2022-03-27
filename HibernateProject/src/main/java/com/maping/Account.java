package com.maping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Account 
{
	@Id
  private int accountno;
	@Column
  private String accname;
  
    @ManyToOne
	Person person;

	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	public String getAccname() {
		return accname;
	}

	public void setAccname(String accname) {
		this.accname = accname;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Account [accountno=" + accountno + ", accname=" + accname + ", person=" + person + "]";
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int accountno, String accname, Person person) {
		super();
   	this.accountno = accountno;
		this.accname = accname;
		this.person = person;
	}
	
	
}
