import java.lang.annotation.Target;
import java.util.Arrays;

public class PairSumSorted {
    public static void main(String[] args) {
        int[] arr ={2,4,5,8,9};
        int n = arr.length;
        int k =7;
        boolean result = Solution(arr,n,k);
        System.out.println(result);
    }
    public static boolean Solution(int[] arr,int n,int k){
        for(int i=0;i<n;i++){
            int req = k-arr[i];
            int result = binarySearch(arr, req);
            if(result!=-1 && result!=i){
                return true;
            }
        }
        
        return false;
        
    }
    public static int binarySearch(int[] arr,int target){
        int low =0;
        int high = arr.length-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
    
            if (arr[mid] == target)
              return mid;
      
            if (arr[mid] < target)
              low = mid + 1;
      
            else
              high = mid - 1;
          }
      
          return -1;
        
    }
    
}
