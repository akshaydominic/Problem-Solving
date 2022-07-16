public class optimalSolution {
    public static void main(String[] args) {
        int[] q = {2,2,2,3,4,4,9};
        int n = q.length;
        int r=Solution(q, n);
        System.out.print("Result "+r);
    }
    public static int Solution(int[] arr,int n){
        int index =1 , count = 1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }else count=1;
            if(count<=2) arr[index++] = arr[i];
        }   
        return index;
    }
}
