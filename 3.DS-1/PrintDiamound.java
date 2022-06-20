public class PrintDiamound {
    public static void main(String[] args) {
        int n = 5;
        printDiamounProb(5);
    }
    static void printDiamounProb(int n){
        for(int row=1;row<=n;row++){
            for(int column = n ;column >= row ;column--){
                System.out.print(" ");
            }
            for(int z=1;z<=row;z++){
                System.out.print("*");
            }
            for(int z=1;z<row;z++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row=1;row<=n;row++){
            for(int column = 1;column <=row; column++){
                System.out.print(" ");
            }
            for(int column = n;column >= row ;column--){
                System.out.print("*");
            }
            for(int column = n;column > row ;column--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
