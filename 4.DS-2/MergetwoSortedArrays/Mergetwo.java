public class Mergetwo {
    public static void main(String[] args) {
        int[] nums1 ={1,2,3};
        int m = nums1.length;
        int[] nums2 ={2,5,6};
        int n = nums2.length;
        int[] results = Solution(nums1, m, nums2, n);
        for(int i=0;i<results.length;i++){
            System.out.print(results[i]+" ");
        }
    }
    public static int[] Solution(int[] nums1, int m,int[] nums2,int n){
        int pointer1 = 0;
        int pointer2 = 0;
        int index=0;
        int[] result = new int[m+n];
        while(pointer1<m && pointer2<n){
            if(nums1[pointer1]<nums2[pointer2]){
                result[index]= nums1[pointer1];
                pointer1++;
                index++;
            }else{
                result[index]=nums2[pointer2];
                pointer2++;
                index++;
            }   
        }
        while(pointer1<m){
            result[index]=nums1[pointer1];
            pointer1++;
            index++;
        }
        while(pointer2<n){
            result[index]=nums2[pointer2];
            pointer2++;
            index++;
        }
        return result;
    }
}
