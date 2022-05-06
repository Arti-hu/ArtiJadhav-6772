package JDBC;
import java.sql.*;

public class jdbcDemo 
{

	public static void main(String[] args) throws SQLException 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///myproject","root","12345");
			Statement st=con.createStatement();

			//String s= "create table Student(Id int,Name varchar(20),Address varchar(15),PhoneNo varchar(10))";
			//String s= "insert into Student values(4,'Avni','Pune','9518301421')";
			//st.executeUpdate("update student set address='Mumbai' where id=3");

			String s= "select * from student";
			ResultSet rs=st.executeQuery(s);
			while(rs.next())
			{
				//System.out.println("Id"+rs.getInt(1)+"    Name"+rs.getString(2)+"    Address"+rs.getString(3)+"    PhoneNo"+rs.getString(4));
			System.out.println(rs.getInt("Id")+"       "+rs.getString("Name")+"      "+rs.getString("Address")+"      "+rs.getString("PhoneNo"));
			}


		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}

}
