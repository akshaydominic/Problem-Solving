public class FactorialNumberusingRec {
    public static void main(String[] args) {
        int result = findFac(5);
        System.out.print("result "+result);
        
    }
    public static int findFac(int n){
        if(n==0){
            return 1;
        }
        return n * findFac(n-1);
    }
}
