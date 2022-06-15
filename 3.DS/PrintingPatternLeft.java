
public class PrintingPatternLeft {
    public static void main(String[] args) {
        String[] pattern = printPattern(4);
        for(int i=0;i<4;i++){
            System.out.println(pattern[i]);
        }
        
    }
    static String[] printPattern(int n){
        String[] result = new String[n];
        String temp ="";
        for(int row=0;row<n;row++){
            for(int column=0;column<=row;column++){
                temp+="*";
            }
            result[row]=temp;
            temp = "";
            
        }
        return result;
    }
}
