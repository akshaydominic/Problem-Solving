public class PrintingPattern {
    public static void main(String[] args) {
        PrintingPyramid(5);
    }
    static void PrintingPyramid(int n){
        for(int row=0; row<n ;row++){
            for(int column=0; column<n ;column++){
                if(row == column){
                    System.out.print("*");
                }else{
                    System.out.print("*_");
                }
            }
            System.out.println();
        }
    }
}
