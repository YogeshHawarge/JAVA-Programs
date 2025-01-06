package StringStarted;

import java.util.Arrays;

public class StringSorting {

	public static void main(String[] args)
	
	{
		
		String[] sa= {"hi","too","Welcome","hefshine"};
		for(int i=0;i<sa.length;i++)
		{
			int min=i;
			for(int j=i+1;j<sa.length;j++)
			{
				if(sa[min].length()>sa[j].length())
                min=j;
			}
			
			String temp=sa[i];
			sa[i]=sa[min];
			sa[min]=temp;	
			
		}
		System.out.println(Arrays.toString(sa));
		
	}

}
