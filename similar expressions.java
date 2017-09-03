import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static String removeBraces(String str)
   
{
	String temp="";
	str=" "+str;
	int len = str.length();
	int check =0;int c=0;
	for(int i =1;i<len;i++)
	{
		if(str.charAt(i) == '(')
		{
			if(str.charAt(i-1) == '-')
			 check++;
			continue;
		}
		else if(str.charAt(i) == ')')
		{
			if(check>0)check --;
			continue;
		}
		else if(check%2 ==0)
		{
			if(str.charAt(i) !='+')
				temp = temp + str.charAt(i);
		}
		else if(check%2 == 1)
		{
			if(str.charAt(i)=='+') temp = temp + '-';
			else if(str.charAt(i)!='-') temp = temp + str.charAt(i);//temp + '+';
			//else
			// temp = temp + str[i];
		}
		

	}
	return temp;
}
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int x=0; x<t; x++)
		{
		    String s1=sc.next();
		    String s2=sc.next();
		    
		    String sa=removeBraces(s1);
		    String sb=removeBraces(s2);
		    char c1[]=sa.toCharArray();
		    char c2[]=sb.toCharArray();
		    int check =0;
		    if(sa.length() == sb.length())
	{	
		
		for(int i =0;i<sa.length();i++)
		{
			for(int j =0;j<sb.length();j++)
			{
				if(c1[i] == c2[j])
				{
					check++;
					c2[j] = '1';
					break;
				}
			}
		}
	
		}
			if(check== sa.length())
		System.out.println("YES");
		else
		System.out.println("NO");
	}
}
}