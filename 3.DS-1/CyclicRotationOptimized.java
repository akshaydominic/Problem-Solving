public class CyclicRotationOptimized {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k =2;
        int n = arr.length;
        int[] result= CycRotation(arr, n, k);
        for(int i=0;i<n;i++){
            System.out.print(result[i]);
        }

        
    }
    static int[] CycRotation(int[] arr, int n, int k){
        int[] result = reversefun(arr,0,n-1);
         result = reversefun(arr, 0, k-1);
         result = reversefun(arr, k,n-1);
         return result;

    }

    static int[] reversefun(int[] arr, int start,int end){
        while(start< end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
