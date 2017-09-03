/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*You are required to complete below class */
class Node{
    int key;
    int value;
    Node pre;
    Node next;
 
    public Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}
class LRUCache {
 int capacity;
 HashMap<Integer, Node> map=new HashMap<Integer, Node>();
 Node head=null;
 Node end=null;
    /*Inititalize an LRU cache with size N */
    public LRUCache(int N) {
       //Your code here
       this.capacity=N;
    }
    
    /*Returns the value of the key x if 
     present else returns -1 */
    public int get(int x) {
       //Your code here
       if(map.containsKey(x))
       {
           Node n=map.get(x);
           remove(n);
           setHead(n);
           return n.value;
       }
       return -1;
    }
    public void remove(Node n)
    {
        if(n.pre!=null)
        {
            n.pre.next=n.next;
        }
        else
        head=n.next;
        
        if(n.next!=null)
        {
            n.next.pre=n.pre;
        }
        else
        end=n.pre;
    }
    public void setHead(Node n)
    {
        n.next = head;
        n.pre = null;
 
        if(head!=null)
            head.pre = n;
 
        head = n;
 
        if(end ==null)
            end = head;
    }
    
    /*Sets the key x with value y in the LRU cache */
    public void set(int x, int y) {
       if(map.containsKey(x)){
            Node old = map.get(x);
            old.value = y;
            remove(old);
            setHead(old);
        }else{
            Node created = new Node(x, y);
            if(map.size()>=capacity){
                map.remove(end.key);
                remove(end);
                setHead(created);
 
            }else{
                setHead(created);
            }    
 
            map.put(x, created);
        }
    }
    }

