package JDBC;
import java.sql.*;
public class DDL
{

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
	     Class.forName("com.mysql.cj.jdbc.Driver");   
	     Connection con=DriverManager.getConnection("jdbc:mysql:///myproject","root","12345");
	     Statement st=con.createStatement();
	     String s="create table Person(ID int,Name varchar(15),Address varchar(20))";
	     
	     String s1="alter table Person add(PhNo varchar(10))";
	     st.executeUpdate(s1);
	     
	     

	}

}
