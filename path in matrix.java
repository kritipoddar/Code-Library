import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int z=0; z<t; z++)
	{
	    int n=sc.nextInt();
	    int a[][]=new int[n][n];
	    int dp[][]=new int[n][n+2];
	    for(int i=0; i<n; i++)
	    {
	        for(int j=0; j<n; j++)
	        {
	            a[i][j]=sc.nextInt();
	        }
	    }
	    for(int i=0; i<n; i++)
	    {
	        dp[i][0]=0;
	        dp[i][n+1]=0;
	    }
	    for(int i=1; i<=n; i++)
	    {
	        dp[0][i]=a[0][i-1];
	    }
	    for(int i=1; i<n; i++)
	    {
	        for(int j=1; j<=n; j++)
	        {
	            
	            dp[i][j]= a[i][j-1]+Math.max(dp[i-1][j-1], Math.max(dp[i-1][j], dp[i-1][j+1]));
	        }
	    }
	    int max=0;
	    for(int i=1; i<=n; i++)
	    {
	        if(dp[n-1][i]>max)
	        max=dp[n-1][i];
	    }
	    System.out.println(max);
	}
	}
}