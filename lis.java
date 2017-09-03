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
		    int lis[]=new int[n];
		    for(int i=0;i<n; i++)
		    {
		        a[i]=sc.nextInt();
		        lis[i]=1;
		    }
		    //int count=1;
		    
		    for(int i=1; i<n; i++)
		    {
		        for(int j=0; j<i; j++)
		        {
		            if(a[j]<a[i] && lis[i]<lis[j]+1)
		            {
		                lis[i]=lis[j]+1;
		            }
		        }
		        
		    }
		    int max=0;
		    for(int i=0; i<n; i++)
		    {
		        if(lis[i]>max)
		        max=lis[i];
		    }
		    System.out.println(max);
		}
	}
}