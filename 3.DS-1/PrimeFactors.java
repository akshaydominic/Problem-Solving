public class PrimeFactors {
    public static void main(String[] args) {
        int n = 24;
        printPrimeFactors(n);
        
    }
    public static void printPrimeFactors(int n){
        for(int count= 2;count<=Math.sqrt(n);count++){
            if(n%count == 0){
                if(isPrime(count)){
                    System.out.print(count+" ");
                }
                if(isPrime(n/count)){
                    System.out.print(n/count+" ");
                }
            }
        }
    }
    public static boolean isPrime(int n){
        if(Math.sqrt(n) == 2){
            return false;
        }
        for(int number=2;number<Math.sqrt(n);number++){
            if(n % number ==0){
                return false;
            }
        }
        return true;
    }
}
