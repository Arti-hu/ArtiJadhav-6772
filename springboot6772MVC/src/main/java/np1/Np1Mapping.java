package np1;
import java.util.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Np1Mapping 
{

	public static void main(String[] args)
	{
		Configuration config=new Configuration();
		config.configure("HibernateMaven.cfg.xml");
		SessionFactory sf=config.buildSessionFactory();
//		Session s=sf.openSession();
        //Transaction tf=s.beginTransaction();
        
        Session session=sf.getSessionFactory().openSession();     
         CriteriaBuilder builder=session.getCriteriaBuilder();
         CriteriaQuery<Department> query=builder.createQuery(Department.class);
//          Root<Department> root=query.from(Department.class);
//          root.fetch("employee",JoinType.LEFT);
         
       //  query.select(root);
        
         
         //List<Department>dp=session.createQuery("from Department",Department.class).getResultList();
         List<Department>dp=session.createQuery("from Department dd join fetch dd.employee",Department.class).getResultList();
         
         for(Department department1:dp)
         {
        	 //System.out.println("Department Details..............");
        	 System.out.println("**********************************************************");
        	System.out.println(department1.getDeptId()+"\t"+department1.getDeptName());
        	 
        	 List<Employee> emp= department1.getEmployee();
        	 
        	 System.out.println("Employee Details.................");
        	 for(Employee employe:emp)
        	 {
        		 System.out.println(employe.getEmpId()+"\t"+employe.getName());
        	 }
         }
		/*
		 * Department d=new Department(); d.setDeptName("IT");
		 * 
		 * Department d1=new Department(); d1.setDeptName("HR");
		 * 
		 * Department d2=new Department(); d2.setDeptName("Finance");
		 * 
		 * 
		 * Employee e=new Employee(); e.setEmpId(1); e.setName("Arti");
		 * e.setDepartment(d);
		 * 
		 * 
		 * 
		 * Employee e1=new Employee(); e1.setEmpId(2); e1.setName("Avni");
		 * e1.setDepartment(d);
		 * 
		 * Employee e2=new Employee(); e2.setEmpId(3); e2.setName("Pooja");
		 * e2.setDepartment(d1);
		 * 
		 * Employee e3=new Employee(); e3.setEmpId(4); e3.setName("Priya");
		 * e3.setDepartment(d1);
		 * 
		 * Employee e4=new Employee(); e4.setEmpId(5); e4.setName("Pratiksha");
		 * e4.setDepartment(d2);
		 * 
		 * Employee e5=new Employee(); e5.setEmpId(6); e5.setName("Vaidahi");
		 * e5.setDepartment(d2);
		 * 
		 * List list1=new ArrayList(); list1.add(e); list1.add(e1);
		 * 
		 * List list2=new ArrayList(); list2.add(e2); list2.add(e3);
		 * 
		 * List list3=new ArrayList(); list3.add(e4); list3.add(e5);
		 * 
		 * d.setEmployee(list1); d1.setEmployee(list2); d2.setEmployee(list3);
		 * 
		 * s.save(d); s.save(d1); s.save(d2);
		 * 
		 * tf.commit();
		 */
     
	}

}
