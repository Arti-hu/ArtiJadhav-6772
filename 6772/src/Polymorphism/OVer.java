package Polymorphism;
class AA
{
	public static String show()
	{
		return "parent";
	}
}
public class OVer extends AA
{
     public static String show()
     {
    	 System.out.println(AA.show());
    	 return "child";
    	 
     }
	public static void main(String[] args) 
	{
		
		//OVer o1=new OVer();
		System.out.println(OVer.show());

	}

}
