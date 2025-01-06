package ArrayDemoPrograms;


public class ArrayEvenOddFinding {

	public static void main(String[] args)
	
	{
		int []a= {23,77,78,54,46};
		int evenCnt=0;
		int oddCnt=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				evenCnt++;	 //evenCount=3
			}
			else
			{
				oddCnt++;	//oddCnt=3
			}
			
		}
		
		int [] evenArr=new int[evenCnt];
		int [] oddArr=new int [oddCnt];
		
		int evenIndex=0;
		int oddIndex=0;
		
		
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			//print array
			
		evenArr[evenIndex]=a[i];
		evenIndex++;
		}
		else
		{
			//print oddarraz	
			oddArr[oddIndex]=a[i];
			oddIndex++;
			
		}
	}
	
	for(int i=0;i<evenArr.length;i++)
	{
		System.out.print(evenArr[i] +" ");
	}
	System.out.println();
	for(int i=0;i<oddArr.length;i++)
	{
		System.out.print(oddArr[i] +" ");
	}
		
		
		

	}

}
