import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int x=0; x<t; x++)
		{
		    int a[][]=new int[4][4];
		    for(int j=0; j<4; j++)
		    {
		        for(int p=0; p<4; p++)
		        {
		            a[j][p]=sc.nextInt();
		        }
		    }
		    int i, k = 0, l = 0, m=4, n=4;
        
        while (k < m && l < n)
        {
            
            for (i = l; i < n; ++i)
            {
                System.out.print(a[k][i]+" ");
            }
            k++;
  
             
            for (i = k; i < m; ++i)
            {
                System.out.print(a[i][n-1]+" ");
            }
            n--;
  
           
            if ( k < m)
            {
                for (i = n-1; i >= l; --i)
                {
                    System.out.print(a[m-1][i]+" ");
                }
                m--;
            }
  
            
            if (l < n)
            {
                for (i = m-1; i >= k; --i)
                {
                    System.out.print(a[i][l]+" ");
                }
                l++;    
            }        
	}
	System.out.println();
}
}
}