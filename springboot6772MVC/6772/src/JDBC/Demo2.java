package JDBC;
import java.sql.*;
public class Demo2 
{

	public static void main(String[] args) throws SQLException
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///myproject","root","12345");
			Statement st=con.createStatement();
			String s="select * from employee where Lower(Name)='mahesh'";
			ResultSet rs=st.executeQuery(s);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"     "+rs.getString(2)+"       "+rs.getString(3)+"       "+rs.getString(4));
			}
			
		} 
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		

	}

}
