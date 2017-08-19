import java.util.Scanner;
import java.util.regex.PatternSyntaxException;


public class practice 
{
	public static  void reverse1(String input) throws PatternSyntaxException
	{
		String[] words=input.split(" ");
		int length=words.length;
		for(int i=0;i<length;i++)
		{
		System.out.println(words[i]);
		}
		System.out.println(input.length());
        
		StringBuilder s=new StringBuilder(input.length());
        //System.out.println(s);
		for(int i=length-1;i>=0;i--)//10: i>=0 11 pass 
		{
			s.append(words[i]);     //
			s.append(" ");
		}
		System.out.println(s.toString());
	}
public static void main(String args[]) 
{
	
String s;
System.out.println("enter the string");
Scanner in =new Scanner (System.in);
s=in.nextLine();
reverse1(s);


}
}
