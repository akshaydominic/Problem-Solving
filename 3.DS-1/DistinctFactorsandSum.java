public class DistinctFactorsandSum {
    public static void main(String[] args) {
        int n = 4;
        int[] sol = distandSum(n);
        for(int index=0;index<sol.length;index++){
            System.out.print(sol[index]+" ");
        }
    }

    public static int[] distandSum(int n){
        if(n == 0){
            return new int[]{0,0};
        }
        if(n==1){
            return new int[]{1,1};
        }
        int[] result = new int[2];
        int sum = n+1; 
        int noOfDistinctFactors = 2;
        for(int count=2;count<n;count++){
            if(n % count ==0){
                sum +=count;
                noOfDistinctFactors++;
            }
        }
        result[0] = noOfDistinctFactors;
        result[1] = sum;
        return result;
    }
}
