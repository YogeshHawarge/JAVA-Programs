package StringStarted;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args)
	
	{
		
		String s1="abcdxyzcd";
		String s2="cd";
		System.out.println();
		System.out.println();
		
		System.out.println(s1.lastIndexOf(s2));//checks the last index
		System.out.println(s1.indexOf(s2));
		System.out.println(s1.startsWith(s2)); //boolean checks
		System.out.println(s1.endsWith(s2)); //
		System.out.println(s1.contains(s2)); //contains the strings 
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.codePointAt(0)); //Ascii value of index of string
		System.out.println(s1.codePointBefore(3));
		System.out.println(s2.isBlank()); //check string contains any charecters or not
		System.out.println(s1.isEmpty()); //checks string is empty or not if space are their not empty
        
		String s3=" yogesh ";
		String s4=s3.trim(); //Trim method removes the spaces before and after
		System.out.println(s4);
		
		String[]a=s1.split("d");
		System.out.println();
        System.out.println(Arrays.toString(a));

	}

}
