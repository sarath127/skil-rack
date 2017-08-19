import java.util.*;
public class ninterreversedsum {

	public static void main(String[] args) 
	{
	  int n,sum=0,s=0,r;
	  Scanner in=new Scanner(System.in);
	  n=in.nextInt();
	  int a[]=new int[n];
	  for(int i=0;i<n;i++)
	  {
		  a[i]=in.nextInt();
	  }
      for(int i=0;i<n;i++)
      {
    	  if(a[i]<0)
    	  {
    	  a[i]=0;
    	  }
    	  if(a[i]%2==0)
    	  {
    		  while(a[i]!=0)
    		  {
    			   r=a[i]%10;
    			   s=s*10+r;
    			   a[i]=a[i]/10;
    		  }
    		  
    		  a[i]=s;
    		  s=0;
    		  System.out.println(a[i]);
    	  }
    	  sum+=a[i];
      }
	System.out.println(sum);
	}
                                 }
