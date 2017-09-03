import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		for(int z=0; z<t; z++)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0; i<n; i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    printMaxOfMin(a, n);
		    System.out.println();
		}
	}
	static void printMaxOfMin(int arr[], int n)
    {
        int dp[][]=new int[n][n];
	    
	    int max_el = -1,el = 0;
	    
	   
	    
	    for(int i = 0; i < n; ++i)     
	        for(int j = 0; j < n; ++j)
	            dp[i][j] = 0;
	         
	   //First get maximum from window size 1.   
	    for(int i = 0; i < n; ++i){
	        dp[0][i] = arr[i];
	        el = dp[0][i];
	            if(max_el < el) 
	                max_el = el;
	    }
	        
       System.out.print(max_el+" ");
	    
	    // i defines the window size. 
	    for(int i = 1; i < n; ++i){
	        max_el = -1;
	        for(int j = 0; j < n-1; ++j){
	            
	            // getting minimum of every window size.
	            dp[i][j] = (int) Math.min(dp[i-1][j] , dp[i-1][j+1]); 
	            el = dp[i][j];
	            if(max_el < el) 
	                max_el = el;
	            
	        }
	       System.out.print(max_el+" ");
	   
        }
    }
}