public class RecursionIntro {
    public static void main(String[] args) {
        int n = 5;
        int result = SumRecursion(n);
        int correctAns = (n*(n+1))/2;
        System.out.print("CorrecAns "+correctAns +" Recursion "+result);
    }
    static int SumRecursion(int n){
        System.out.print(" calling r ");
        if(n == 1){
            return 1;
        }
        return n + SumRecursion(n-1);
    }
}
