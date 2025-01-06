package StringStarted;

import java.util.Arrays;

public class StringReverseWordsQ22 {

	public static void main(String[] args) 
	
	{
		
		String s="You are very very good students";
		String []sa=s.split(" ");
		//String; []sa1=new String[sa.length];
		
		int index=0;
		String s2="";
		for(int i=sa.length-1;i>=0;i--)
		{
			//sa1[index++]=sa[i];	   
			s2=s2+sa[i]+" ";
		}
	  System.out.println(s2 +" ");
	   
		
      // System.out.println(Arrays.toString(sa));
       
      
       
      //Q2 String reverse with words
	   //uoY era yrev yrev doog stneduts 
         
      String []sa2=s.split(" ");
      
      for(int i=0;i<sa2.length;i++)
      {
    	  String temp=sa[i];
    	  String rev="";
    	  
    	  for(int j=temp.length()-1;j>=0;j--)
    	  {
    		  rev=rev+temp.charAt(j);
    		  
    	  }  
    	  sa2[i]=rev;
      }
      
      
      String strpro="";
      for(int i=0;i<sa.length;i++)
      {
    	  strpro=strpro+sa2[i]+" ";
      }
     System.out.println(strpro);
   
    
 
	}

}
