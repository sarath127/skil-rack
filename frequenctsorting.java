import java.util.*;
public class frequenctsorting {
	static int x;
	private static Scanner in;
public static void main(String[] args) {
	in = new Scanner(System.in);
	int n;
	n=in.nextInt();
	int a[]=new int [n];
	int b[][]=new int[a.length][2];
	for(int i=0;i<a.length;i++)
	{
		a[i]=in.nextInt();
	}
	a=sort(a);
	b[x][0]=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]==a[i-1])
		{
			b[x][1]=b[x][1]+1;
		}
		else
		{
			x++;
			b[x][0]=a[i];
		}
		
	}
	x++;
	
	b=sort(b);
	/*for(int i=0;i<x;i++)
	{
		for(int j=i+1;j<x;j++)
		{
			if(b[i][1]==b[j][1])
			{
				swap(b,i,j);
			}
			
		}
	}*/

	for(int i=0;i<x;i++)
	{
		for(int j=0;j<1;j++) //for(int j=0;j<=b[i][1];j++)
		{
			System.out.print(" "+b[i][0]);
			
		}
	}
		
}


public static int[][] sort(int b[][])
{
	int c[]=new int[2];

	for(int i=0;i<x;i++)
	{
		for(int j=i+1;j<x;j++)
		{
			
			if(b[i][1]<b[j][1])
			{
				c=b[i];
				b[i]=b[j];
				b[j]=c;
			}
		}
	}
	return b;	
	
}
public static int[] sort(int a[])
{
	int temp;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	return a;
	
}
public static int[][] swap(int b[][],int rowa,int rowb)
{
	for(int j=0;j<b.length;j++)
	{
		int  temp[]=b[rowa];
		b[rowa]=b[rowb];
		b[rowb]=temp;
	}
	return b;
	
}


}

