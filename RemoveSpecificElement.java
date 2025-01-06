package StringStarted;

public class RemoveSpecificElement {

	public static void main(String[] args) 
	
	
	{
		String s= "abcababcabc";
		
		String s1="";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!='b')
			s1=s1+s.charAt(i);
			
		}
		System.out.println(s1);
		
	}

}
