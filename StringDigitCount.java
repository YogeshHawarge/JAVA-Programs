package StringStarted;

public class StringDigitCount {

	public static void main(String[] args)
	{

		String s="gfxehgdhghg3";

		int cnt=0;

		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<i;j++)
			{
				if(s.charAt(i)>='0' && s.charAt(i)<='9')
                 {
					cnt++;
					break;
				 }

			}
		}
		if(cnt==0)
			System.out.println("not Digit");
		else
			System.out.println("digit");


	}

}