//Java program to calculate sum of the numbers appear in a given string

package Assignment;


public class String7 
{

	public static void main(String[] args) 
	{
		
      String s1="it 15 is 25 a 20 string";
      String[]s2=s1.split(" ");
      int a=0,b; 
     
      for(int i=0;i<s2.length;i++)
      {
    	  if(s2[i].equals("15")||s2[i].equals("25")||s2[i].equals("20"))
    	  {
    		// b=Integer.parseInt(s2[i]);
    		 a=a+Integer.parseInt(s2[i]); 
    		 
    	  }
      }
      System.out.println(a);
     
	}

}
