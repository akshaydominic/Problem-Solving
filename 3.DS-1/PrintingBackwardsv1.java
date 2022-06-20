public class PrintingBackwardsv1 {
    public static void main(String[] args) {
        printNumbRec(5);
    }
    public static void printNumbRec(int n) {
        if(n == 0){
            return;
        }
        System.out.print(n+" ");
        printNumbRec(n-1);
    }
}
