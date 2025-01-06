
package ArrayDemoPrograms;

public class DeffereneBetweenMinMax {

	public static void main(String[] args)
	
	{
	
	int [] a={11,33,45,66,88};
	int max=Integer.MIN_VALUE;
	int min=Integer.MAX_VALUE;
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
			max=a[i];
		
	}
	System.out.println(max);
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<min)
			min=a[i];
		
	}
	System.out.println(min);

	System.out.println((max-min));
	
	
	}

}
