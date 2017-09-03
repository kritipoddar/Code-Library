import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int v=0; v<t; v++)
		{
		    long n=sc.nextLong();
		    String s=Long.toBinaryString(n);
		    long nn=n-1;
		    long i= n&nn;
		    //String st=Integer.toString(i);
		    //System.out.println(i);
		    if(n==0)
		    System.out.println("NO");
		    else
		    if(i==0)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}