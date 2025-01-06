package StringStarted;

public class StringFrequencyCount {

	public static void main(String[] args)

	{
		String s="abcdabcdabab";
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		char ch=0;
		char ch2=0;
		
		for(int i=0;i<s.length();i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(s.charAt(i)==s.charAt(j))
					cnt++;

			}
			
			if(cnt==0)
			{
			
				int fre=0;
				for(int j=0;j<s.length();j++)
				{
					if(s.charAt(i)==s.charAt(j))
						fre++;
				}
				if(fre>max)
				{
					max=fre;
					ch=s.charAt(i);
				}
				if(fre<min)
				{
					min=fre;
					ch2=s.charAt(i);

				}

				System.out.println(s.charAt(i)+" " +fre);	

			}

		}
		
		System.out.println("--------");
		System.out.println(ch +" "+max);
		
		System.out.println("---------");
		
		System.out.println(ch2 +" "+min);
	


	}

}
