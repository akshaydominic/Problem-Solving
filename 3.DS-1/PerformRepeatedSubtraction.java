import java.util.Collections;
import java.util.PriorityQueue;

//perform repeated subtractions in an array :-
public class PerformRepeatedSubtraction {
    public static void main(String[] args) {
        int n =5;
        int[] a ={2,1,11,13,7};
        int result = reduceArraySolution(n,a);
        System.out.println("Remaining element: "+result);
    }    
    public static int reduceArraySolution (int n, int[] a){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int index = 0; index<n;index++){
            pq.add(a[index]);
        }
        // get the largest number in the pq
        while(pq.size()> 1 ){
            int largestNum = returnMaxel(pq);
            int secondlargestNum = returnMaxel(pq);
            int result = Math.abs(largestNum)- Math.abs(secondlargestNum);
            pq.add(result);   
        }
        return pq.peek();
    }

    public static int returnMaxel(PriorityQueue<Integer> pq){
        return pq.poll();
    }
}

