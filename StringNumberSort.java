package StringStarted;

import java.util.Iterator;

public class StringNumberSort {

	public static void main(String[] args)
	
	{
		String s="654321";
		
		char[]ca=s.toCharArray();
		
		for(int i=0;i<ca.length;i++)
		{
			for(int j=i+1;j<ca.length;j++)
			{
				if(ca[i]>ca[j])
				{
					char temp=ca[i];
					ca[i]=ca[j];
					ca[j]=temp;
						
				}
				
			}
		
		}
         System.out.println(ca);
		//String s2=new String(ca);
		//System.out.println(s2);
		
		
		
		
	}

}
