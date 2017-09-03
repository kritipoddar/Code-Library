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
		    int a[]=new int[n];
		    int x=sc.nextInt();
		    for(int i=0; i<n; i++)
		    {
		        a[i]=sc.nextInt();
		        
		    }
		    Arrays.sort(a);
		    int c=0;
		    for(int i=0; i<n-2; i++)
		    {
		        int j=i+1, k=n-1;
		        while(j<k)
		        {
		            if(a[i]+a[j]+a[k]>=x)
		            k--;
		            
		            else
		            {
		                c+=(k-j);
		                j++;
		            }
		        }
		    }
		    System.out.println(c);
		}
	}
}