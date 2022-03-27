package com.maping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainMapping {

	public static void main(String[] args)
	{
		Configuration con=new Configuration();
		con.configure("HibernateMaven.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tf=session.beginTransaction();
		
         
		Person p=new Person();
		p.setName("Vaidahi");
		
		Account  ac= new Account();
		ac.setAccountno(111);
		ac.setAccname("Current");
		ac.setPerson(p);
		
		Account  ac1=new Account();
    	ac1.setAccountno(222);
		ac1.setAccname("Saving");
		ac1.setPerson(p);
		
		
		List<Account>list1= new ArrayList<Account>();
		list1.add(ac);
		list1.add(ac1);
		
		p.setAccount(list1);
	
		session.save(p);
		//session.save(list1);
	//	session.save(ac1);
		tf.commit();
		
	}

}
