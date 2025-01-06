package ArrayDemoPrograms;

public class ArrayUniquePairRemoveDuplicate {

	public static void main(String[] args) 
	
	{
		
		int[]a={1,1,2};
	
     //check array contain duplicate 
	//Remove duplicate 
		
		int unique=0;
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
					cnt++;
			}
			if(cnt==0)
			unique++;
		}
		//System.out.println(unique);

		int []b=new int[unique]; 
		
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			
			int cnt2=0;
		
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				cnt2++;	
			}
			
			if(cnt2==0)
			{
			b[index]=a[i];
			index++;
			}
		}
		
	//calculate and show the all pairs
		
	for(int i=0;i<b.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
				System.out.println(b[i]+" "+b[j]);
			}
	}
		

		
	 }
		

	}


