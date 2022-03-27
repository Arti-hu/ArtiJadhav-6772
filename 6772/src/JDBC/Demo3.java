package JDBC;
import java.sql.*;
public class Demo3
{

	public static void main(String[] args) throws SQLException
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///myproject","root","12345");
			Statement st=con.createStatement();
			//String s="create table Student11(RollNo int,Name varchar(15),Address varchar(20))";
			st.executeUpdate("insert into Student11 values(4,'Utkarsha','Islampur')");
			
//			ResultSet rs=st.executeQuery("select * from Student11");
//			while(rs.next())
//			{
//				//System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
//				 System.out.println(rs.getInt("RollNo")+"\t"+rs.getString("Name")+"\t"+rs.getString("Address"));
//				
//			}
		} 
		catch (ClassNotFoundException e) 
		{
			
			System.out.println("Error is occured "+e);
		}

	}

}
