import java.io.*;
 
class GFG 
{
    // Function to toggle bits in the given range
    static int toggleBitsFromLToR(int n, int l, int r)
    {
        // calculating a number 'num' having 'r'
        // number of bits and bits in the range l
        // to r are the only set bits
        int num = ((1 << r) - 1) ^ ((1 << (l - 1)) - 1);
  
        // toggle bits in the range l to r in 'n'
        // and return the number
        return (n ^ num);
    }
     
    // driver program
    public static void main (String[] args) 
    {
        int n = 50;
        int l = 2, r = 5;
        System.out.println(toggleBitsFromLToR(n, l, r));
    }
}