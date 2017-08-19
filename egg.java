import java.util.*;
public class egg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String a[]=new String[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.next();
		}
		int get=in.nextInt();
		String s=in.next();
		
		String series[]=new String[100];
		series[0]=s;
		String temp=s;
		
		int m=1;
		
		for(int i=0;i<15;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				
				String x=temp.substring(temp.length()-1);
				String y=a[j].substring(0,1);
				
				if(x.equals(y))
				{
					series[m]=a[j];
					
					temp=a[j];
					m++;
				}
				
			}
		}
					
			
			
			
				System.out.println(series[get-1]);
			
	
		

	}

}
