package ArrayDemoPrograms;

import java.util.Arrays;

public class AdditionofS1S2InS3 {

	public static void main(String[] args) 
	
     {	
		int []s1= {11,22,44,66,88,98};
	    int []s2= {23,45,66,};
	    
	   
	    int []s3=new int[s1.length+s2.length];
	    
	    int index=0;
	    for(int i=0;i<s1.length||i<s2.length;i++)
	    {
	    	if(i<s1.length)
	    	s3[index++]=s1[i];
	    	if(i<s2.length)
	    	s3[index++]=s2[i];

	    }
	    
	    System.out.println(Arrays.toString(s3));
		
	

	}

}


