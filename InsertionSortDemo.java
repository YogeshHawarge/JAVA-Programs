
package ArrayDemoPrograms;

public class InsertionSortDemo {

	public static void main(String[] args)
	
	{
		
		int []a={11,33,44,65,98,10};
		
		for(int i=1;i<a.length;i++)
		{
			int temp=a[i];
			int j=i-1;
			for(;j>=0;j--)
			{
	
			   if(a[j]>temp)
				{
				a[j+1]=a[j];	
				}
				else
				{
					break;
	
				}
			}
			
			a[j+1]=temp;
		}
	
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i] +" ");
		     
			}
		

	}

}
