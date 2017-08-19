import java.util.*;
public class n3o {
	public static void main(String[] args) {
		String s;
		int count=0;
		Scanner in=new Scanner(System.in);
		s=in.next();
		int flag=0;
		String number="";
		for(int i=0;i<s.length();i++)
		{
			char a=s.charAt(i);
			
			if(Character.isDigit(a))
			{
				count++;
				if(count==3&& count<=3)
				{
					flag=1;
				}
				if(count>3)
				{
					flag=0;
					continue;
					
				}
			}
			else
			{
				count=0;
				if(flag==1)
				{
					break;
				}
			}
			
		}
		System.out.println(flag);
                    if(flag==0)
                    {
	                 System.out.println(-1);
                    }
                    if(flag==1)
                    {
                    	for(int i=0;i<s.length();i++)
                		{
                			char a=s.charAt(i);
                			
                			if(Character.isDigit(a))
                			{
                				count++;
                				if(count==3|| count<=3)
                				{
                					number=number+a;
                					flag=1;
                					
                				}
                				if(count>3)
                				{
                					number="";
                					flag=0;
                				
                					
                				}
                			}
                			if(Character.isLetter(a)||i==s.length()-1)
                			{
                				count=0;
                				
                				if(flag==1)
                				{
                					if(number.length()>=3)
                					{
                						System.out.print(number+" ");
                						number="";
                					}
                					number="";
                				}
                			}
                			
                		}	
                    	

                    }
                    		
	}

}
