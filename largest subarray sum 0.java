class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
        int sum=0, maxlen=0;
        for(int i=0; i<n; i++)
        {
            sum+=arr[i];
            if(arr[i]==0 && sum==0)
            maxlen=1;
            
            if(sum==0)
            maxlen=i+1;
            Integer l=map.get(sum);
            if(l!=null)
            maxlen= (int) Math.max(maxlen, i-l);
            else
            map.put(sum, i);
        }
        return maxlen;
    }
}