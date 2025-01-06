	package ArrayDemoPrograms;

public class MaxValueInArray {

	public static void main(String[] args) 
	
    {
	  int[]a= {11,22,33,55,44};
	  int max=Integer.MIN_VALUE;
	  for(int i=0;i<a.length;i++)
	  {
		  if(a[i]>max)
			 max=a[i];
	  } 
		 System.out.println(max);
	
		

	}

}
