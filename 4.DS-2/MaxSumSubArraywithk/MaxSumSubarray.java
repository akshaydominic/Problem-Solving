public class MaxSumSubarray {
    public static void main(String[] args) {
        int[] q ={2,1,-4};
        int k =3;
        int n = q.length;
        int result = Solutions(q, n, k);
        System.out.println(result);

    }
    public static int Solutions(int[] arr, int n, int k){
        // using two pointers sliding window 
        int startptr =0 ,sum =0, maxSum=Integer.MIN_VALUE;
        for(int endptr=0;endptr<n;endptr++){
             sum = sum + arr[endptr];
            if(endptr >= k-1){
                maxSum = Math.max(sum, maxSum);
                sum= sum-arr[startptr];
                startptr++;
            }
        }
        return maxSum;
    }
    //        //3 3
    //2 1 -4 //-1
    
}
