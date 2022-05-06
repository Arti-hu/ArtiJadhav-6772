package m2m;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class m2mMain
{

	public static void main(String[] args) 
	{
		Configuration con=new Configuration();
		con.configure("HibernateMaven.cfg.xml");		
		SessionFactory sf= con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction ts=session.beginTransaction();
		
		Employee e=new Employee();
		e.setEmpName("Arti");
		
		Employee e1=new Employee();
		e1.setEmpName("Avni");
 
		List<Employee>list1=new ArrayList();
		list1.add(e);
		list1.add(e1);
		
		Project p = new Project();
		p.setProjectId(111);
		p.setProjectName("Java");
		p.setEmployee(list1);
		
		Project p1 = new Project();
		p1.setProjectId(222);
		p1.setProjectName("Python");
		p1.setEmployee(list1);
		
		
		List<Project> list2=new ArrayList();
		list2.add(p);
		list2.add(p1);
		
		e.setProject(list2);
		e1.setProject(list2);
		
		
//		session.save(list1);
//		session.save(list2);
		session.save(e);
		session.save(e1);
		session.save(p);
		session.save(p1);
		
		ts.commit();
		
	}

}
