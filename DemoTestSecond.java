package ArrayDemoPrograms;

public class DemoTestSecond {

	public static void main(String[] args) {
		
		int arr[]= {1,3,5,7,8,20,-40,-6};
		
		int left=0;
		int right=arr.length-1;
		
		int closestSum=Integer.MAX_VALUE;
		int []closestPair=new int[2];
		
		while(left<right)
		{
			int currentSum=arr[left]+arr[right];
			
	   if(Math.abs(currentSum)<Math.abs(closestSum))
	   {
		closestSum=currentSum;
		closestPair[0]=arr[left];
		closestPair[1]=arr[right];
		}
	   
	   if(currentSum<0)
	   {
		   left++;
		  
	   }
	   else if(currentSum>0)
	   {
		   right--;
	  
		} 
	   else
	   {
		   System.out.println(arr[right]+""+arr[left]);
		   return;
		   
	   }
	   
		}
		System.out.println(closestPair[0]+"  "+closestPair[1]);
	

	}

}
