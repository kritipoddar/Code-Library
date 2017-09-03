import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int m=0; m<t; m++)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    int ms[]=new int[n];
		    for(int i=0; i<n ; i++)
		    {
		        a[i]=sc.nextInt();
		        ms[i]=a[i];
		    }
		    int max=0;
		    for(int i=1; i<n ; i++)
		    {
		        for(int j=0; j<i; j++)
		        {
		            if(a[i]>a[j] && ms[i]<ms[j]+a[i])
		            ms[i]=ms[j]+a[i];
		        }
		    }
		    for(int i=0; i<n ; i++)
		    {
		        if(ms[i]>max)
		        max=ms[i];
		    }
		    System.out.println(max);
		}
	}
}