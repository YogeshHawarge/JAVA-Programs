package ArrayDemoPrograms;

public class ArrayContainSpecificElement {

	public static void main(String[] args) 
	
	{
		int a[]={11,22,33,44,55,66};
		
		
	    int ele=99;
		int cnt=0;	
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
			{
			System.out.println("found");
			cnt++;
			}
		}
		if(cnt==0)
		{
			System.out.println("not found");
		}
	
	}

}
