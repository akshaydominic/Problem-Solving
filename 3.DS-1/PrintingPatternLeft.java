
public class PrintingPatternLeft {
    public static void main(String[] args) {
        String[] pattern = printPattern(5);
        for(int i=0;i<10;i++){
            System.out.println(pattern[i] + " "+i);
        }
        
    }
    static String[] printPattern(int n){
        String[] result = new String[n+n];
        String temp ="";
        for(int row=0;row<n;row++){
            for(int column=0;column<=row;column++){
                temp+="* ";
            }
            result[row]=temp;
            temp = "";
        }
        for(int row=0;row<n-1;row++){
            for(int column=n-1 ;column >row;column--){
                temp+="* ";
            }
            result[row+n]=temp;
            temp="";
        }
        return result;
    }
}
