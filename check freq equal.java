import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
		int t;
		String s;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		sc.nextLine();
		HashMap<Character,Integer> h = new HashMap<Character,Integer>();
		ArrayList<Integer> arr;
		boolean flag = true;
		while(t-- > 0)
		{
		    s = sc.nextLine();
		    //System.out.println(s);
		    h.clear();
		    boolean miniflag = true;
		    for(int i = 0;i<s.length();i++)
		    {
		       if(h.get(s.charAt(i)) == null)
		    	   h.put(s.charAt(i),1);
		       else
		       {
		           miniflag = false;
		           h.put(s.charAt(i),h.get(s.charAt(i))+1);
		       }     
		    }
		    if(miniflag)
		    {
		        System.out.println(1);
		        flag = true;
		       
		    }
		    else//print(h.values());
		    {
		        for(int i = 0;i<s.length();i++)
		    {	
		    	flag = false;
		    	char key=s.charAt(i);
		    	int val=h.get(s.charAt(i));
		    	if(h.get(s.charAt(i))-1 == 0)
		    	h.remove(s.charAt(i));
		    	else
		    	h.put(s.charAt(i), h.get(s.charAt(i))-1);
		    	
		    	arr = new ArrayList<Integer>(h.values());
		    //	print(arr);
		        int j = 0;
		    	for(j = 1;j<arr.size();j++)
		    	{	
		    		if(arr.get(j) != 0 &&arr.get(j) != arr.get(0))
		    			break;
		    	}
		    	if(j == arr.size())
		    	{
		    		System.out.println(1);
		    		flag = true;
		    		break;
		    	}
		    	else
		    		h.put(key, val);
		    }
		    }
		    if(!flag)
		    System.out.println(0);
		}
	}
}