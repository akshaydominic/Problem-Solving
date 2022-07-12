import java.util.Arrays;
import java.util.Scanner;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int size= nums.length;
        int index=0;
        Arrays.sort(nums);
        while(index < size && nums[index]<=0){
            index++;
        }
        int expectedNumber = 1;
        for(int i=index;i<size;i++){
            if(i!=size-1 && nums[i]==nums[i+1]){
                continue;
            }
            if(nums[i]==expectedNumber){
                expectedNumber++;
                continue;
            }
            return expectedNumber;
        }
        return expectedNumber;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; ++i) {
            nums[i] = in.nextInt();
        }
        int result = new FirstMissingPositive().firstMissingPositive(nums);
        System.out.println(result);
    }
}
