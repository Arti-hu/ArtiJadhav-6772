//Implement the assignment 1 using Linked List

package CollectionAssignment;
import java.util.*;

public class Assignment6 
{
    LinkedList<Integer> A1=new LinkedList();
    public void saveEvenNumber(int N)
    {
    	for(int i=2;i<=N;i++)
    	{
    		if(i%2==0)
    		{
    			A1.add(i);
    		}
    	}
    }
    
   
    public void printEvenNumber()
    {
    	int c;
    	LinkedList A2=new LinkedList();
    	for(Integer a:A1)
    	{ 
    		 c =a * 2;
    		 A2.add(c);
    	}
    	System.out.println(A2+" ");
    }
    
    public String printEvenNumber(int N)
    {
	    
    	for(int i=0;i<A1.size();i++)
    	{
    		if(A1.get(i)==N)
    		{
    			return N+" found at index "+i;
    		}  
    		
    	}
    	return "Not Available";
    }
 
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Assignment6 As=new Assignment6();
		As.saveEvenNumber(10);
		As.printEvenNumber();
		System.out.println("Enter element to search in list");
		int a=sc.nextInt();
		System.out.println(As.printEvenNumber(a));
		
	}

}
