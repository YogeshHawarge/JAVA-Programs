package StringStarted;

public class StringSumOFDigits {

	public static void main(String[] args) 

	
	{
		
		String s1="ddsf3456";
		
		int sum=0;
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>'0' && s1.charAt(i)<='9')
			{
				sum=sum+(s1.charAt(i)-48);
			}
			
		}
		System.out.println(sum);
		
		
		

	}

}
