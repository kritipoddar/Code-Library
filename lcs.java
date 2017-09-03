import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int z=0; z<t; z++)
		{
		    int m=sc.nextInt();
		    int n=sc.nextInt();
		    String s1=sc.next();
		    String s2=sc.next();
		    char a[]=s1.toCharArray();
		    char b[]=s2.toCharArray();
		    int res=strfunc(a, b, m, n);
		    System.out.println(res);
		}
	}
	public static int strfunc(char a[], char b[], int m, int n)
	{
	    int L[][] = new int[m+1][n+1];
 
    
    for (int i=0; i<=m; i++)
    {
      for (int j=0; j<=n; j++)
      {
        if (i == 0 || j == 0)
            L[i][j] = 0;
        else if (a[i-1] == b[j-1])
            L[i][j] = L[i-1][j-1] + 1;
        else
            L[i][j] = max(L[i-1][j], L[i][j-1]);
      }
    }
  return L[m][n];
	}
	public static int max(int a, int b)
	{
	    return a>b ? a:b;
	}
}