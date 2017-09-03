/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*Complete the function below*/
class GfG{
    public static ArrayList<String> printPath(int[][] m, int n)
{
TreeSet<String> l=new TreeSet<String>();
check(m,0,0,n,l,"");
ArrayList<String> al=new ArrayList<String>(l);
return al;
}
static void check(int m[][],int i,int j,int n,TreeSet<String> l,String str){
if(i<0||j<0||i==n||j==n)return;
if(i==n-1&&j==n-1)
{
l.add(str);
return;
}
if(m[i][j]==1){
m[i][j]=2;
check(m,i-1,j,n,l,str+"U");
check(m,i+1,j,n,l,str+"D");
check(m,i,j-1,n,l,str+"L");
check(m,i,j+1,n,l,str+"R");
m[i][j]=1;
}  //Your code here
     }
}