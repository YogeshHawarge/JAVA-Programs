package StringStarted;

import java.util.Arrays;

public class StringSortingByAnotherMethod {

	public static void main(String[] args)
	
	{
		//Ascending Order of STring Conversion
		
		String[]sa= {"hi","hello","Welcome","hefshine"};
		
		for(int i=0;i<sa.length;i++)
		{
			for(int j=i+1;j<sa.length;j++)
			{
				if(sa[i].length()>sa[j].length())
				{
					String temp=sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
			}
		}
		
		
		System.out.println(Arrays.toString(sa));

			
		String[]sb= {"hi","hello","Welcome","hefshine"};
		
	
		for(int i=0;i<sb.length;i++)
		{
			for(int j=i+1;j<sb.length;j++)
			{
				if(sb[i].length()<sb[j].length())
				{
					String temp=sb[i];
					sb[i]=sb[j];
					sb[j]=temp;
				}
			}
		}
		
		
		
		
		System.out.println(Arrays.toString(sb));


	}

}
