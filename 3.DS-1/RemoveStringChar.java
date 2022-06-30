public class RemoveStringChar {
    public static void main(String[] args) {
        String example = "0123";
        String result = removeChar(example);
        System.out.print("Result "+result);
        // write a function to remove zero from the string 
    }
    public static String removeChar(String num){
        String solution = new String();
        for(int index = 0;index<num.length();index++){
            if(num.charAt(index)!='0'){
                solution+=num.charAt(index);
            }
        }
        return solution;
    }
}
