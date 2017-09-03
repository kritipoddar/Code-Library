class GfG
{
  
    int tour(int petrol[], int distance[])
    {
       Deque<Integer> deque = new LinkedList<>();
        for(int i=0;i<petrol.length; i++){
            deque.add(petrol[i]-distance[i]);
        }
        int count = 0;
        int n=0;
        int index=0;
        while(count>=0 && n<petrol.length && index<petrol.length){
            n++;
            Integer element = deque.remove();
            count = count+  element;
            deque.add(element);
            if(count<0){
                index = index + n;
                n=0;
                count=0;
            }
                
        }
        if(index<petrol.length)
            return index;
        else return -1;
    }
    
   
}