public class PrintingBackwardsN {
    public static void main(String[] args) {
        printNumber(15);
    }

    public static void printNumber(int n) {
        if(n == 1){
            System.out.print(n+" ");
            return ;
        }
        printNumber(n-1);
        System.out.print(n+" ");
    }
}
