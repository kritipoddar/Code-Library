import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int x=0; x<t; x++)
		{
		    int n=sc.nextInt();
		    PriorityQueue<Integer> p=new PriorityQueue<Integer>();
		    for(int i=0; i<n; i++)
		    {
		        p.offer(sc.nextInt());
		    }
		    int sum=0;
		    int res=0;
		    while(p.size()!=1)
		    {
		        sum=p.poll()+p.poll();
		        res=res+sum;
		        p.offer(sum);
		    }
		    System.out.println(res);
		}
	}
}