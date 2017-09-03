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
		    for(int i=0; i<n; i++)
		    {
		        a[i]=sc.nextInt();
		        
		    }int max=-1;
		    List<Integer> l=new ArrayList<Integer>();
		    for(int i=n-1; i>=0; i--)
		    {
		        if(a[i]>max)
		        {
		            max=a[i];
		         l.add(a[i]);
		         
		        }
		    }
		    ListIterator i=l.listIterator(l.size());
		    while(i.hasPrevious())
		    {
		        Object e=i.previous();
		        System.out.print(e+" ");
		    }
		    System.out.println();
		}
	}
}