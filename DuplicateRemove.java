package ArrayDemoPrograms;

public class DuplicateRemove {

	public static void main(String[] args) 
	
	
	{
	   int cnt=0;
		
	   int []a={11,33,55,66,78,66,33,55,98};  
	  
	   for(int i=0;i<a.length;i++)
	   {
		   
		   for(int j=0;j<i;j++)
		   {
			   if(a[j]==a[i])
			   {
				cnt++;   
			   }
			}
           if(cnt==0)
           {
        	   System.out.println(a[i]);
           }
           }
           System.out.println("count of duplicates:" +cnt);
	   
        
	   }
	   
	   	
	}


