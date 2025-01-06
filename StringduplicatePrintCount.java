package StringStarted;

public class StringduplicatePrintCount {

	public static void main(String[] args) 
	
	{
		
		String s="acbdacbdabdhfgabcdg";
		
		int count=0;
		String s2="";
		
		for(int i=0;i<s.length();i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				cnt++;
			}
			if(cnt>0)
			{
			s2=s2+s.charAt(i);
			count++;
			}
			
			}
		System.out.println(count);
        System.out.println(s2);
		
	}
	
}
