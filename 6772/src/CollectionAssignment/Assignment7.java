//Implement the assignment 1 using Vector

package CollectionAssignment;
import java.util.*;

public class Assignment7 
{
   Vector<Integer> v1=new Vector();
   public void saveEvenNumber(int N)
   {
	   for(int i=2;i<=N;i++)
	   {
		   if(i%2==0)
		   {
			   v1.add(i);
		   }
		  
	   }
	   //System.out.println(v1);
   }
   
   
   public void printEvenNumber()
   {
	   Vector<Integer> v2=new Vector();
	   for(Integer ir1:v1)
	   {
		   int a=ir1  *2;
		   v2.add(a);	
		   
		}
	   System.out.println(v2);
   }
   
	 public String printEvenNumber(int N)
	    {
		    
	    	for(int i=0;i<v1.size();i++)
	    	{
	    		if(v1.get(i)==N)
	    		{
	    			return N+" found at index "+i;
	    		}  
	    		
	    	}
	    	return "Not Available";
	    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Assignment7 ass7 =new Assignment7();
		ass7.saveEvenNumber(10);
		ass7.printEvenNumber();
		System.out.println("Enter element to search in list");
		int a=sc.nextInt();
		System.out.println(ass7.printEvenNumber(a));
		
	}

}
