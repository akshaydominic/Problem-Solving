public class FindfirstOne {
    public static void main(String[] args) {
        int[] q={0,0,0,1,1,1,1,};
        int result = FindfirstOne_solution(q, q.length);
        System.out.print(result);

    }
    public static int FindfirstOne_solution(int[] a,int n){
        int left =0;
        int right = n-1;
        int ans =-1;
        while(left<=right){
            int mid = (left+right)/2;

            if(a[mid]==1){
                ans = mid;
                right=mid-1;
            }else{
                left= mid+1;
            }
        }
        return ans;
    }
}
