public class CoprimesN {
    public static void main(String[] args) {
        int n = 9;
        int results = CoPrime(n);
        System.out.print("Number of Coprimes "+results);

    }

    public static int CoPrime(int n){
        int results = 0;
        for(int i=1;i<n;i++){
            if(n % i == 0){
                results++;
            }
        }
        return results;
    }
    public static int FindFactors(int n){
        
    }
}
