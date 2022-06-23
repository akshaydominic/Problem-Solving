public class PrintingFactorsOpti {
    public static void main(String[] args) {
        int n = 24;
        printFact(n);
    }
    public static void printFact(int n){
        int sizeUpto = (int)Math.sqrt(n);
        for(int count=2;count<=sizeUpto;count++){
            System.out.println();
            if(n % count ==0){
                System.out.print("fac "+count);
                System.out.print("div "+n/count);
            }
        }
    }
}
