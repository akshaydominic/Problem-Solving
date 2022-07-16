public class TripletMaximum {
    public static void main(String[] args) {
        long[] arr ={3,7,4,2,5,7,5};
        int n =arr.length;
        long result = Solution(n, arr);
        System.out.println(result);
    }
    public static long Solution(int n,long[] arr){
        // keep middle then find max left and max right then add and return max sum
        long maxSum =0 ;
        for(int i=1;i<n-1;i++){
            long leftMax = 0;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i] && arr[j]>leftMax){
                    leftMax = arr[j];
                }
            }
            if(leftMax ==0){
                continue;
            }
            long rightMax= 0;
            for(int j=i+1;j<n;j++){
                if(arr[j]> arr[i] && arr[j]>rightMax){
                    rightMax = arr[j];
                }
            }
            if(rightMax ==0){
                continue;
            }
            long result = leftMax + arr[i]+rightMax;
            if(result>maxSum){
                maxSum= result;
            }
        
        }
        return maxSum;
    }
}
