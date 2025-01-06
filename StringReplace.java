package StringStarted;

public class StringReplace {

	public static void main(String[] args)

	{

		String s = "sfsfsfsfshsfsfsfsf";

		//Replace method 'd' by 'g'

		String s1 = s.replace('f', 'd');
		System.out.println(s1);

		//Second logic

		String s2 = "";
		
		for (int i=0; i<s.length(); i++) 
		{
			if (s.charAt(i) == 'f')
				s2 = s2 + 'd';
			else
				s2 = s2 + s.charAt(i);

		}

		System.out.println(s2);

	}

}
