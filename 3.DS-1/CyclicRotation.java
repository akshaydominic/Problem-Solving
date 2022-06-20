public class CyclicRotation {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int n = arr.length;
        int k = 4;
        int[] results = CyclicRotationProb(n, k, arr);
        for(int i=0;i<n;i++){
            System.out.print(results[i]+" ");
        }
    }//1 2 3 4 5
    //5 1 2 3 4
    //4 5 1 2 3

    static int[] CyclicRotationProb(int n, int k ,int[] arr){
        int[] results = new int[n];
        int lastDigitpos = n-1;
        k = k % n;
        while(k > 0){
            System.out.print("in while " +k+" times ");
            results[0] = arr[lastDigitpos];
            for(int i=0;i<n-1;i++){
                results[i+1]=arr[i];
            }
            for(int i=0;i<n;i++){
                arr[i]=results[i];
            }
            k--;    
        }

        return results;
    }
}
