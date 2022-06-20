public class findFactorial {
    public static void main(String[] args) {
        System.out.println(Factorial(4)); 
    }
    public static int Factorial(int n) {
        if(n == 0){
            return 1;
        }
        int result = 1,i=1;
        while(i<=n){
            result = result * i;
            i++;
        }
        return result;
    }
}
