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
		    int s=n;
		    String tt=Integer.toString(n);
		    String st=convert (n);
		    System.out.println(st);

	
		}
	}
	public static String convert(int n)
	{
	    
		if (n < 20) {
			return units(n);
		}

		if (n < 100) {
			return tens(n / 10) + ((n % 10 != 0) ? " " : "") + units(n % 10);
		}

		if (n < 1000) {
			return units(n / 100) + " hundred" + ((n % 100 != 0) ? " and " : "")+  convert(n % 100);
		}

		
			return convert(n / 1000) + " thousand" + ((n % 10000 != 0) ? " " : "") + convert(n % 1000);
		
		
	}
	public static String units(int no)
	{
	    String s="";
	    switch(no)
	    {
	        case 0:
	            s="";
	            break;
	            
	        case 1:
	            s= "one";
	            break;
	            
	            case 2:
	                s="two";
	                break;
	            
	            case 3:
	                s= "three";
	                break;
	                
	           case 4:
	                s= "four";
	                break;
	           
	           case 5:
	                s= "five";
	                break;
	           
	           case 6:
	                s= "six";
	                break;
	           
	           case 7:
	                s= "seven";
	                break;
	           
	           case 8:
	                s= "eight";
	                break;
	           
	           case 9:
	                s="nine";
	                break;
	                
	                case 10:
	                    s= "ten";
	                    break;
	                    
	           case 11:
	            s="eleven";
	            break;
	            
	            case 12:
	                s="twelve";
	                break;
	                
	            case 13:
	                s= "thirteen";
	                break;
	                
	           case 14:
	                s= "fourteen";
	                break;
	           
	           case 15:
	                s= "fifteen";
	                break;
	           
	           case 16:
	                s= "sixteen";
	                break;
	           
	           case 17:
	                s= "seventeen";
	                break;
	           
	           case 18:
	                s= "eighteen";
	                break;
	           
	           case 19:
	                s= "nineteen";
	                break;
	             
	    }
	    return s;
	}
	public static String tens(int no)
	{
	    String s="";
	    switch(no)
	    {
	        
	            case 0:
	                s= "";
	                break;
	                
	                case 1:
	                    s= "";
	                    break;
	          
	                case 2:
	                s= "twenty";
	                break;
	            
	            case 3:
	                s= "thirty";
	                break;
	                
	           case 4:
	                s= "forty";
	                break;
	           
	           case 5:
	                s="fifty";
	                break;
	           
	           case 6:
	                s= "sixty";
	                break;
	           
	           case 7:
	                s= "seventy";
	                break;
	           
	           case 8:
	                s="eighty";
	                break;
	           
	           case 9:
	                s= "ninety";
	                break;
	           
	    }
	    return s;
	}
}