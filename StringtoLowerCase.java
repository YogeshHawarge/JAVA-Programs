package StringStarted;

public class StringtoLowerCase {

	public static void main(String[] args) 
	
	{
		
		String s1="abcDEF";
		
		String s2=s1.toLowerCase();
		System.out.println(s2);
		
		
		String s4="sdfg";
		
		String s5=s4.toUpperCase();
		System.out.println(s5);
		
		//
		
		String s3="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>='A' && ch<='Z')
				s3=s3+ch;
			else
				s3=s3+(char)(ch-32);
			
		}
		
		System.out.println(s3);

	}

}
