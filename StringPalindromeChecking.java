package StringStarted;

public class StringPalindromeChecking {

	public static void main(String[] args) 
	{
		
		String s="abccba";
	    
		String s2="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			s2=s2+s.charAt(i);
		}
		
		if(s.equals(s2))
			System.out.println("palidrome ");
		else
			System.out.println("not palindrome");
	
	}



}

