import java.util.*;
public class array_maximum_sum_divisble_by_n {
public static void main(String[] args) {
	int n,div,sum=0;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	div=in.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=in.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		int t=n;
		while(t!=0)
		{
			for(int j=0;j<t;j++)
			{
				sum+=a[i];
			}
			t--;
		}
		
	}
}
}
