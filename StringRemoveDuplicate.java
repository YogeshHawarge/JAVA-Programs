package StringStarted;

public class StringRemoveDuplicate {

	public static void main(String[] args) 
	
	{
		
		String s="abcabcabccd";
		String s2="";
		
		for(int i=0;i<s.length();i++)
		{
		    int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(s.charAt(i)==s.charAt(j))
					cnt++;
			}	
			
		   if(cnt==0)
		   {
			s2=s2+s.charAt(i);
			
		   }
	  }	 
		
		System.out.println(s2);
			
		
	}

}
