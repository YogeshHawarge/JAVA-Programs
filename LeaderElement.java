	
package ArrayDemoPrograms;

public class LeaderElement {

	public static void main(String[]args)
	
	{
	int []a={11,33,66,44,77,88,78};
		
		for(int i=0;i<a.length;i++)
		{
		int cnt=0;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[j]>a[i])
			{
				cnt++;
			}
		}
		if(cnt==0)
		System.out.println(a[i]);
		

		}
	}
		
		
	}


