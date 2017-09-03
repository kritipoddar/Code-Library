import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int x=0; x<t; x++)
		{
		    int n=sc.nextInt();
		    long res=calc(n+1);
		    System.out.println(res);
		}
	}
	public static long calc(int n)
	{
	    long res[]=new long[n];
	    res[0]=1;
	    res[1]=1;
	    for(int i=2; i<n; i++)
	    {
	        res[i]=0;
	        for(int j=1; j<=2 && j<=i; j++)
	        {
	            res[i]+=res[i-j]% 1000000007;
	        }
	    }
	    return res[n-1]% 1000000007;
	}
}