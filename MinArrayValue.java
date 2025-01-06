package ArrayDemoPrograms;

public class MinArrayValue {

	public static void main(String[] args) 
	
	{
		int []b= {55 ,33 ,11,55,67};
		int min=Integer.MAX_VALUE;
		for(int i=0;i<b.length;i++)
		{
			
			if(b[i]<min)
				min=b[i];
		
		}
		System.out.println(min);
		
	

	}

}
