public class SearchinSortedRotatedArray {
    public static void main(String[] args) {
        int[] q={4,5,6,9,10,2,3};
        int result = SearchinSortedRotatedArray_solution(q, 3);
        System.out.print("Result: "+result);
    }
    public static int SearchinSortedRotatedArray_solution(int[] nums,int target){
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid =(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[left]<=nums[mid]){
                // sorted array 
                if(target>=nums[left] && target<nums[mid]){
                    right =mid-1;
                }else{
                    left = mid +1;
                }

            }else{
                if(target>nums[mid] && target <=nums[right]){
                    left = mid +1;
                }else{
                    right = mid -1;
                }

            }
        }
        return -1;
    }
}
