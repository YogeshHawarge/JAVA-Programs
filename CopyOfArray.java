package ArrayDemoPrograms;

public class CopyOfArray {

	public static void main(String[] args)
	{
		
		int []a = {100,200,300,400,500};
		int []b =  new int[a.length];
		//System.out.println(b.length);
		for(int i=0;i<a.length;i++)
		{
		b[i]=a[i];
        System.out.println(b[i]);
		}		
		

	}

}
