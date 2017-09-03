/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


// Function to return maximum XOR subset in set[]
class GfG
{
int maxSubarrayXOR(int A[], int n)
{
    int index=0, bit=32;
    for(int i=bit-1; i>=0; i--)
    {
        int maxi=index, maxe=-1;
        for(int j=index; j<n; j++)
        {
            if((A[j]&(1<<i))!=0 && A[j]>maxe)
            {
                maxe=A[j];
                maxi=j;
            }
            
        }
        if(maxe== -1)
        continue;
        
        int temp=A[index];
        A[index]=A[maxi];
        A[maxi]=temp;
        
        maxi=index;
        
        for (int j=0; j<n; j++)
        {
            
            if ((j!=maxi) && ((A[j] & (1<<i)) !=0))
                A[j] = A[j]^A[maxi];
        }
        index++;
    }
    
    int res=0;
    for(int i=0; i<n; i++)
    {
        res=res^A[i];
    }
    return res;
}
}