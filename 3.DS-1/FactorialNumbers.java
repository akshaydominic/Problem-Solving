public class FactorialNumbers {
    public static void main(String[] args) {
        int findFactorial = 5;
        int result = factorialReturn(findFactorial);
        System.out.print("Factorial is "+result);
    }   
    public static int factorialReturn(int n){
        int result = 1;
        for(int index=1;index<=n;index++){
            result *= index;
        }
        return result;
    }
}
