import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaveSort {
    public static void main(String[] args) {
        List<Integer> q = new ArrayList<>(Arrays.asList(1,5,1,1,6,4));
        List<Integer> s =waveSortSolution(q);
        for(int i:s){
            System.out.print(i+" ");
        }
    }
    public static List<Integer> waveSortSolution(List<Integer> nums){
        int n = nums.size();
        for(int i=1;i<n;i=i+2){
            if(nums.get(i)< nums.get(i-1)){
                int temp = nums.get(i);
                nums.set(i, nums.get(i-1));
                nums.set(i-1, temp);
            }
            if(i!=n-1 && nums.get(i)<nums.get(i+1)){
                int temp = nums.get(i);
                nums.set(i, nums.get(i+1));
                nums.set(i+1, temp);
            }
        }
        return nums;
    }
}
