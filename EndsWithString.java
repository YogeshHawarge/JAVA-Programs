package StringStarted;

public class EndsWithString {

	public static void main(String[] args) 
	
	{
		
		String s1="abcds";
		String s2="ds";
	
		
	//By Method	
		
	boolean b=s1.endsWith(s2);
	System.out.println(b);

	
	//With logic 
	
			if(s2.length()>s1.length())
				System.out.println(false);
			else
			{
				
				int s1Index=s1.length()-1;
				int s2Index=s2.length()-1;
				int cnt=0;
				while(s2Index>=0)
				{
					if(s1.charAt(s1Index)==s2.charAt(s2Index))
					{
					cnt++;
					}
					s1Index--;
					s2Index--;
				}
				
			    if(cnt==s2.length())
				System.out.println(true);
				else
				System.out.println(false);
			    
			
	}

	}}
