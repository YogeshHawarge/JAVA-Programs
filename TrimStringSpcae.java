package StringStarted;

public class TrimStringSpcae {

	public static void main(String[] args)
	
	
	{
		
		String s="        hii hefshine           ";
		
	//By Using Trim Method
		
		String s1=s.trim();
		System.out.println(s1);

		System.out.println("------------------------------------");
	
		
		
		//without trim()
		
		int startIndex=0;
		while(true)
		{
			if(s.charAt(startIndex)==' ')
			{
			  startIndex++; 
			}
			else
			{
				break;
			
			}
		}
		
		int endIndex=s.length()-1;

		while(true)
		{
			if(s.charAt(endIndex)==' ')
				endIndex--;
			else
			   break;
			
			
		}
		
		for(int i=startIndex;i<=endIndex;i++)
		{
		System.out.print(s.charAt(i));
		}	
			
		}
		
		
	}


