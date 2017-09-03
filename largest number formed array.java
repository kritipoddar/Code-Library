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
		    }
		    
		    System.out.println(printlargest(a));
		}
	}
	static String printlargest(int arr[])
	{
	    String a[]=new String[arr.length];
	    for(int i=0; i<arr.length; i++)
	    {
	        a[i]=String.valueOf(arr[i]);
	    }
	    Arrays.sort(a, new Comparator<String>(){
	        public int compare(String a, String b)
	        {
	            return (b+a).compareTo(a+b);
	        }
	    });
	    
	    StringBuilder sb=new StringBuilder();
	    for(String s : a)
	    sb.append(s);
	    
	    while(sb.charAt(0)=='0' && sb.length()>1)
	    {
	        sb.deleteCharAt(0);
	    }
	    
	    return sb.toString();
	}
}