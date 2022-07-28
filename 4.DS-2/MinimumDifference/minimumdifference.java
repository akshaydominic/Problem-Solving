import java.util.Arrays;

public class minimumdifference {
    public static void main(String[] args) {
        int[] a ={1,2,4};
        int result = solution_minimum(a, a.length);
        System.out.print("result "+result);
    }
    public static int solution_minimum(int[] arr,int n){
        Arrays.sort(arr);
        int minimum = Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            int result =Math.abs(Math.abs(arr[i])-Math.abs(arr[i+1])); 
            minimum = Math.min(result, minimum);
        }
        return minimum;
    }
}
