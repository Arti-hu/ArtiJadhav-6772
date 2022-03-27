package String;
import java.util.*;
public class Token 
{

	public static void main(String[] args) 
	{
		 Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        StringTokenizer st=new StringTokenizer(s," ,'?");
	       // System.out.println(st;
	        System.out.println(st.countTokens());
	        while(st.hasMoreElements())
	        {
	           
	            System.out.println(st.nextElement());
	        }
	        
	        scan.close();
	    
       
	}

}
