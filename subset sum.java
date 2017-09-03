import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		for(int x=0; x<t; x++)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0; i<n; i++)
		    a[i]=sc.nextInt();
		    
		    boolean res=subset(a, n);
		    if(res==true)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
	public static boolean subset(int a[], int n)
	{
	    int sum=0;
	    for(int i=0; i<n; i++)
	    sum+=a[i];
	    if(sum%2!=0)
	    return false;
	    boolean dp[][]=new boolean[sum+1][n+1];
	    
	    
	    for(int i=0; i<=n; i++)
	    dp[0][i]=true;
	    for(int i=1; i<=sum/2; i++)
	    dp[i][0]=false;
	    
	    for(int i=1; i<=sum/2; i++)
	    {
	        for(int j=1; j<=n; j++)
	        {
	            dp[i][j]=dp[i][j-1];
	            if(i>=a[j-1])
	                dp[i][j]=dp[i][j] || dp[i-a[j-1]][j-1];
	        }
	    }
	    return dp[sum/2][n];
	    
	}
}