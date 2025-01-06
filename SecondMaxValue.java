package ArrayDemoPrograms;

public class SecondMaxValue {

	public static void main(String[] args) 
	
	{
	
		int a[]= {11,22,44,55,66};
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			max=a[i];
		}
		
		int secMax=Integer.MIN_VALUE;
	
		for(int i=0;i<a.length;i++)
		{
		if(a[i]>secMax && a[i]!=max)
			secMax=a[i];
		}
		System.out.println(secMax);
		

	}

}
