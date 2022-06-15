public class BinarySearch {
    public static void main(String[] args) {
        int[] findArray = {10,20,30,40,50,60,70,80};
        int n = findArray.length;
        int x = 20;
        int result = BinarySearchfinding(findArray, n, x);
        System.out.println("Result is found at location "+result);

    }

    static int BinarySearchfinding(int[] arr, int n,int x){

        int target = x;
        int left = 0;
        int right = n-1;
        int result = -1;
        while(left <= right){
            int mid = (left+right)/2;

            if(target > arr[mid]){
                left = mid +1;
            }
            else if(target < arr[mid]){
                right = mid-1;
            }
            else{
                result = mid;
                right = mid -1;
                
            }
        }
        return result;
    }

}
