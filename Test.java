package ArrayDemoPrograms;

public class Test {

	public static void main(String[] args) {

		int []arr= {9,4,6,2,10,10};
		int []arr2= {14,3,6,9,10,15,17,9};

		for(int i=0;i<arr.length;i++)
		{
			int cnt=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				int cnt2=0;
				for(int k=0;k<arr2.length;k++)
				{	
					if(arr[i]==arr2[k])
					{
						cnt2++;
					}
				}
				if(cnt2!=0)
				{
					System.out.println(arr[i]);
				}
			}
		}		
	}
}



