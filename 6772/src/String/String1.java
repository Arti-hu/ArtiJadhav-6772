package String;

public class String1 {

	public static void main(String[] args) 
	{
		String s1 = "  Arti  ";
		String s2 = "Riya";
		
		System.out.println(s1);
		System.out.println(s1.trim());
		char[]chars= {'h','e','l','l','o','j','a','v','a'};
		
		//String str=new String(chars,startindex,int numchars)  
		String str=new String(chars,3,4);  
		System.out.println(str);

	}

}
