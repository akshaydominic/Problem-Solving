import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {
    public static void main(String[] args) {
        Solution sl = new Solution();
        sl.Insert(10);
        sl.Insert(20);
        sl.Insert(100);
        int result = sl.getMax();
        System.out.print("Max: "+result);
    }
    
}
class Solution{
    PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());

    public void Insert(int element){
        maxpq.add(element);
    }
    public int getMax(){
        return maxpq.poll();
    }
}