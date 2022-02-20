package Modifier;


public  class UsingPrivate
{
	private int a=30;
	private void show()
	{
		System.out.println("Value of A is  "+a);
	}
	public static void main(String[] args) 
	{
		
		UsingPrivate u1=new UsingPrivate();
		u1.show();

	}

}
