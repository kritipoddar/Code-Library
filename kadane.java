import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int x=0; x<t; x++)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0; i<n; i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int maxhere=0, maxfar=Integer.MIN_VALUE;
		    for(int i=0; i<n;i++)
		    {
		        maxhere=maxhere+a[i];
		        if(maxhere>maxfar)
		        maxfar=maxhere;
		        if(maxhere<0)
		        maxhere=0;
		    }
		    System.out.println(maxfar);
		}
	}
}