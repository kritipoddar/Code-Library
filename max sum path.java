import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0; i<n ; i++)
        {
            for(int j=0; j<n; j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        long dp[][]=new long[n][n];
        long sum = 0;
        //dp[0][0]=a[0][0];
        for(int i=0; i < n; i++){
            dp[0][i] = sum + a[0][i];
            sum = dp[0][i];
        }
        sum = 0;
        for(int i=0; i < n; i++){
            dp[i][0] = sum + a[i][0];
            sum = dp[i][0];
        }
        for(int i=1; i<n ; i++)
        {
            for(int j=1; j<n; j++)
            {
                
                    dp[i][j]= a[i][j]+ min(dp[i-1][j], dp[i][j-1]);
            }
        }
        System.out.println(dp[n-1][n-1]);
    }
    public static long min(long a, long b)
    {
        return a<b ? a:b;
    }
}