import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>(Collections.reverseOrder());;//lower half
    static PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();//higher half
 
    // Adds a number into the data structure.
    public static void addNum(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());
 
        if(maxHeap.size() < minHeap.size()){
            maxHeap.offer(minHeap.poll());
        }
    }
 
    // Returns the median of current data stream
    public static int findMedian() {
        if(maxHeap.size()==minHeap.size()){
            return (maxHeap.peek()+(minHeap.peek()))/2;
        }else{
            return maxHeap.peek();
        }
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int x=0; x<t; x++)
		{
		    int n=sc.nextInt();
		    addNum(n);
		    int med=findMedian();
		    System.out.println(med);
		}
	}
}