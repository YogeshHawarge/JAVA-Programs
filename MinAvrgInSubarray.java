package ArrayDemoPrograms;

public class MinAvrgInSubarray {

	public static void main(String[] args)
	
	{
	
		int []a={3,7,90,20,5,50,40};
		
		int sizeofSubarray=3;
		
		int min=Integer.MAX_VALUE; //minimum calculate
		int startIndex=-1;
		
		
		for(int i=0;i<=a.length-sizeofSubarray;i++)
		{
			int sum=0;
			for(int k=i;k<i+sizeofSubarray;k++)
			{
			
				sum=sum+a[k];
			}
			//System.out.println(sum);
			//System.out.println("----");
			
			int avrg=sum/sizeofSubarray;
			
			if(avrg<min)
			{
				min=avrg;
				startIndex=i;
				
			}
		}
		
		System.out.println(min);
		
	}

}
