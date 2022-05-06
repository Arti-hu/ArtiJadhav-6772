package Array;

public class TwoDimentional 
{

	public static void main(String[] args) 
	{
		int[][]ar=new int[2][4];
		ar[0][0]=1;
		ar[0][1]=2;
		ar[0][2]=4;
		ar[0][3]=5;
		
		ar[1][0]=6;                                          	                                                
		ar[1][1]=7;
		ar[1][2]=8;
		ar[1][3]=9;
		//System.out.println(ar.length);
     
		for(int i=0;i<ar.length;i++)         //for rows
		{
			for(int j=0;j<ar[i].length;j++)    //for column
			{
				
				System.out.print(ar[i][j]+"  ");
			}
			System.out.println(ar[i].length);
			System.out.println("\n");
			
		}
	}

}



