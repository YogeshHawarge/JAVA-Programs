

package ArrayDemoPrograms;

public class ReverseDemo {

	public static void main(String[] args)
	{
	
		int []a={11,22,33,44,55};
		
		int start=0;
		int end=a.length-1;
		
		while(start<end)   //{11,22,|| 33, ||44, 55}HAlf PArt
		{
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}	
			
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i] +" ");
	}
	}

	}


