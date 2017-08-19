import java.util.*;
public class appleandboxes {
public static void main(String[] args) {
	
	int n,k,count=0;
	int t1=0,t2=0,t3=0;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	k=in.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=in.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		if(a[i]==k)
		{
			t3=a[i];
			for(int i1=0;i1<n;i1++)
			{
			if(a[i1]==t3)
			{
				a[i1]=0;
			}
			}
			count++;
			
		}
		for(int j=0;j<n;j++)
		{
			if(a[i]+a[j]==k)
			{
				t1=a[i];
				t2=a[j];
				count++;
				System.out.println(t1+" "+t2);
				break;
			}
		}
		for(int l=0;l<n;l++)
		{
			if(a[l]==t1||a[l]==t2)
			{
				a[l]=0;
			}
		}
	}
			System.out.println(count);

                                       }
}
