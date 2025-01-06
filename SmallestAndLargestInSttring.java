package StringStarted;

public class SmallestAndLargestInSttring {

	public static void main(String[] args) 
	
	
	{
		
		String s="hi welcome too hefshine";
		
		String []sa=s.split(" ");
		
		for(int i=0;i<sa.length;i++)
		{
			for(int j=i+1;j<sa.length;j++)
			{
				if(sa[i].length()>sa[j].length())
				{	
				String temp=sa[i];
				sa[i]=sa[j];
				sa[j]=temp;
				
				}
					
			}
		}
		System.out.println("smallest : " +sa[0]);
		System.out.println("largest : " +sa[sa.length-1]);
		
		
	}

}
