import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int x=0; x<t; x++)
		{
		    String s=sc.next();
		    int n=s.length();
		    boolean p[][]=new boolean[n][n];
		    int c[]=new int[n];
		    
		    for(int i=0; i<n; i++)
		    p[i][i]=true;
		    int i,j,k,l;
		    for(l=2; l<=n; l++)
		    {
		        for(i=0; i<n-l+1; i++)
		        {
		            j=i+l-1;
		            if(l==2)
		                p[i][j]=s.charAt(i)==s.charAt(j);
		          else
		          {
		              p[i][j]=(s.charAt(i)==s.charAt(j)) && p[i+1][j-1];
		          }
		          
		        }
		    }
		    for( i=0; i<n; i++)
		    {
		        if(p[0][i]==true)
		            c[i]=0;
		            else
		            {
		                c[i]=10000000;
		                for( k=0; k<i; k++)
		                {
		                    if((p[k+1][i]==true)&&c[i]>c[k]+1)
		                    c[i]=c[k]+1;
		                }
		            }
		    }
		    System.out.println(c[n-1]);
		    
		}
	}
}