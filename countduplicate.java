import java.util.*;
public class countduplicate {
public static void main(String[] args) {
	int n;
	Scanner in =new Scanner (System.in);
	n=in.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=in.nextInt();
	}
	HashSet<Integer> set=new HashSet<Integer>();
	HashSet<Integer> duplicate_set=new HashSet<Integer>();
	for(int i=0;i<n;i++)
	{
		if(set.contains(a[i]))
		{
			duplicate_set.add(a[i]);
		}
		else
		{
			set.add(a[i]);
		}
		
	}
	System.out.print(duplicate_set.size());
}
}
