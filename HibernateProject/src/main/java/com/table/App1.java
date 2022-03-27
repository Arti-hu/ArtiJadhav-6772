package com.table;

import java.util.List;
import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;




public class App1 
{

	public static void main(String[] args) 
	{
		Configuration con=new Configuration();
		con.configure("HibernateMaven.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tf=session.beginTransaction();
		System.out.println("Successfully created.....");
		
		
		/*
		 * Student11 s=new Student11(); s.setSname("Arti"); s.setEducation("MSc.CS");
		 * 
		 * Student11 s1=new Student11(); s1.setSname("Rahel"); s1.setEducation("MCA");
		 * 
		 * Student11 s2=new Student11(); s2.setSname("Anagha"); s2.setEducation("BCS");
		 * 
		 * 
		 * session.saveOrUpdate(s); session.saveOrUpdate(s1); session.saveOrUpdate(s2);
		 * tf.commit();
		 */
		
		//Display all records
    
		/*
		 * String s="from Student11"; Query que=session.createQuery(s); List<Student11>
		 * list=que.list();
		 * System.out.println(list.get(0)+"\n"+list.get(1)+"\n"+list.get(2));
		 */
    
      
      //fetch records Using Named parameters
    
		/*
		 * String s=" from Student11 stu where stu.rollno=:rno"; Query
		 * query=session.createQuery(s); 
		 * query.setParameter("rno", 1); 
		 * List<Student11> list=query.list();
		 * System.out.println(list);
		 */
		
		
		//Named parameter using scanner
		/*
		 * Scanner sc=new Scanner(System.in);
		 * System.out.println("Enter element which you want to search");
		 * int a=sc.nextInt();
		 *  System.out.println("Enter element which you want search");
		 * String b=sc.next();
		 * 
		 * String s="from Student11 stu where stu.rollno=:roll and stu.sname=:nm"; 
		 * Query q=session.createQuery(s);
		 *  q.setInteger("roll",a); 
		 *  q.setString("nm", b);
		 * List<Student11>list=q.list(); 
		 * for(int i=0;i<list.size();i++) 
		 * {
		 * System.out.println(list.get(i)); 
		 * }
		 * 
		 */
      
      //Fetch record using positional parameter
		
		
		/*
		 * String s="from Student11 stu where stu.sname=?0"; Query
		 * q=session.createQuery(s); q.setParameter(0,"Rahel"); List<Student11>
		 * list=q.list(); 
		 * System.out.println(list);
		 * 
		 * 
		 */
		//Positional parameter using scanner
		
		/*
		 * Scanner sc=new Scanner(System.in);
		 * System.out.println("Enter element which you want to search"); 
		 * String  a=sc.next();
		 * String s="from Student11 stu where stu.education=?0";
		 * Query q=session.createQuery(s);
		 * q.setParameter(0, a); 
		 * List<Student11>list=q.list();
		 * for(int i=0;i<list.size();i++) 
		 * {
		 *  System.out.println(list.get(i)); }
		 */
		
		//Update the records
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter roll no which you want to update");
//		int a=sc.nextInt();
//		System.out.println("Enter element which you want to update");
//		String b=sc.next();
//		String s="update Student11 stu set stu.sname=?0 where stu.rollno=?1";
//		Query q=session.createQuery(s);
//		q.setParameter(0, b);
//		q.setParameter(1, a);
//		int i=q.executeUpdate();
//		if(i>0)
//		{
//			tf.commit();
//			System.out.println("Successfully updated");
//		}
//		else
//		{
//			System.out.println("Sorry!.. record not updated");
//		}
//		
		 
		
		//Delete records
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll no which you want to delete");
		int a=sc.nextInt();
		String s="delete from Student11 where rollno=:rn";
		Query q=session.createQuery(s);
		q.setParameter("rn", a);
		int i=q.executeUpdate();
		if(i>0)
		{
			tf.commit();
			System.out.println("Record deleted");
			
		}
		else
		{
			System.out.println("Sorry!....");
		}
		
	}

}
