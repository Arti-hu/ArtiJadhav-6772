package JDBC;
import java.sql.*;

public class Demo1 
{

	public static void main(String[] args) throws SQLException
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///myproject","root","12345");
			Statement st=con.createStatement();
//			String s="Create table Employee(EMpId int , Name varchar(15),Post varchar(20),Phno varchar(10))";
//			int i=st.executeUpdate(s);
//			int i=st.executeUpdate("insert into employee values(3,'Omkar','Data Analyst','9518301421')");
//			if(i>0)
//			{
//				System.out.println("Record Inserted");
//			}
//			else
//			{
//				System.out.println("Not inserted");
//			}
			
			
			ResultSet rs=st.executeQuery("select * from employee");
			
			while(rs.next()) 
			{
				System.out.println(rs.getInt(1)+"       "+rs.getString(2)+"       "+rs.getString(3)+"       "+rs.getString(4));
			}
			
		} 
		catch (ClassNotFoundException e)
		{
			
			e.printStackTrace();
		}

	}

}
