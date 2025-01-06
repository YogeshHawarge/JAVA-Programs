package ArrayDemoPrograms;

public class InsertionSortpractice {

	public static void main(String[] args) 
	
	{
		
		int []a= {11,22,34,55,10};
   
		
	 for(int i=1;i<a.length;i++)
	 {
		 int j=i-1;
		 int temp=a[i];
		 for (;j>=0;j--)
		 {
			if(a[j]>temp)
			{
				a[j-1]=a[i];
			}
			else
			{
				break;
			}
			
			a[j+1]=temp;
		 }
	 }
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] +" ");
			
		}
	
	}

}
