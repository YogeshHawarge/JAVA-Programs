package StringStarted;

import java.util.Arrays;
import java.util.Iterator;
public class StringfreuncyMax 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "welcome";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		int max=Integer.MIN_VALUE;
		char ch=0;
		for(int i=0;i<s1.length();i++)
		{
			int cnt2=0;
			for(int j=0;j<i;j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				cnt2++;
			}
			if(cnt2==0)
			{
				int frq=0;
				for(int j=0;j<s1.length();j++)
				{
					if(s1.charAt(i)==s1.charAt(j))
					frq++;
				}
				if(frq>max)
				{
					max=frq;
					ch=s1.charAt(i);
				}
			}
		}
		System.out.println(max);
		System.out.println(ch);
	}
}