import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		Queue<Character> q=new LinkedList<Character>();
		for(int x=0; x<t; x++)
		{
		    int n=sc.nextInt();
		    map.clear();
		    q.clear();
		    char ch='0';
		    boolean cu=false;
		    for(int i=0; i<n; i++)
		    {
		        String s=sc.next();
		        char c=s.charAt(0);
		        
		        if(i==0)
		        {
		            ch=c;
		            System.out.print(ch+" ");
		            map.put(c,1);
		            q.add(c);
		        }
		        else
		        {
		        Integer f=map.get(c);
		        if(f==null)
		        {
		            map.put(c, 1);
		            q.add(c);
		        }
		        else
		        map.put(c, f+1);
		        
		        if(c!=ch && cu==false)
		        {
		            System.out.print(ch+" ");
		        }
		        else
		        {
		            while(!q.isEmpty()&& map.get(q.peek())!=1)
		            {
		               
		                    q.remove();
		            }
		            if(q.isEmpty())
		            {
		                System.out.print(-1+" ");
		                cu=true;
		            }
		            else
		            {ch=q.peek();
		            cu=false;
		            System.out.print(q.peek()+" ");
		            }
		        }
		        
		    }
		}
		System.out.println();
	}
}
}