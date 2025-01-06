package ArrayDemoPrograms;

public class EqualityOfArray {

	public static void main(String[] args) 
	
	{
		int []a={1,3,5,6,7};
		int []b={2,4,6,8,9};
		
		if(a.length==b.length)
		{
			int cnt=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==b[i])
				cnt++;	
			}
			if(cnt==a.length)
				System.out.println("same");
			else
				System.out.println("not same");
		}
		else
		{
			System.out.println("not same");
		}
				
		}
		
		

	}


