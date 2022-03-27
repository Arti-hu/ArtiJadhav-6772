package com.maping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Person 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(nullable=false)
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL)
	List<Account> account;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccount() {
		return account;
	}

	
	public void setAccount(List<Account> account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", account=" + account + "]";
	}

	public Person(int id, String name, List<Account> account) {
		super();
		this.id = id;
		this.name = name;
		this.account = account;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
