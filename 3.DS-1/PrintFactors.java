public class PrintFactors{
    public static void main(String[] args) {
        int n =24;
        printingFactors(n);

    }

    public static void printingFactors(int n){
        for(int index=2;index<=n;index++){
            if(n % index ==0){
                System.out.print(index+" ");
            }
        }
    }
}