import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Collections.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int x=0; x<t; x++)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int a[]=new int[n];
		    int b[]=new int[m];
		    int sum1=0, sum2=0;
		    
		    for(int i=0; i<n; i++)
		    {
		        a[i]=sc.nextInt();
		        sum1+=a[i];
		    }
		    for(int i=0; i<m; i++)
		    {
		        b[i]=sc.nextInt();
		        
		        sum2+=b[i];
		    }
		    int diff= 0;
		    int bb;
		    if(n<m)
		     {
		         diff=(sum1-sum2)/2;
		         bb=res(a,b, diff);
		     }
		    else{
		        diff=(sum2-sum1)/2;
		        bb=res(b, a, diff);
		    }
		        
		    if(bb==1)
		    System.out.println(bb);
		    else
		    System.out.println(-1);
		}
	}
	public static int res(int a[], int b[], int d)
	{
	    int flag=0;
	    Set<Integer> map = new HashSet<Integer>();
	    for(int i=0; i<a.length; i++)
	    {
	        map.add(a[i]);
	    }
	    for(int i=0; i<b.length; i++)
	    {
	        if(map.contains(b[i]+d))
	            {
	                flag=1;
	                break;
	            }
	    }
	    if(flag==1)
	    return 1;
	    else
	    return 0;
	}
}