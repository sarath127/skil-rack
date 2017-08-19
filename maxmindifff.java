import java.io.InputStreamReader;
import java.util.*;
public class maxmindifff {
	public static int max(int a)
	{
		int r;
		int max=Integer.MIN_VALUE;
	
				
		while(a!=0)
		{
			r=a%10;
			if(r>max)
			{
				max=r;
			}
			a=a/10;
			
		}
		
		return max;
	}
	public static int min(int a)
	{
		int r;
		int min=Integer.MAX_VALUE;
	
				
		while(a!=0)
		{
			r=a%10;
			if(r<min)
			{
				min=r;
			}
			a=a/10;
		}
		
		return min;

	}
	public static void main(String[] args) {
int a;
Scanner in=new Scanner (System.in);
a=in.nextInt();
int b;
b=max(a)-min(a);
System.out.println(b);
}
}
