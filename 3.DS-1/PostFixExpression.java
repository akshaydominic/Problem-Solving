import java.util.Stack;

public class PostFixExpression {
    public static void main(String[] args) {
       String exp="2132";
       int result = postFixSolution(exp);
        System.out.print("Solution : "+result);
    }
    public static int postFixSolution(String exp){
        Stack<Integer> st = new Stack<>();
        int length  = exp.length();
        // if(exp.length() == 1){ //wrong my child
        //     return exp.charAt(0)-'0';
        // }
        int num =0;
        for(int index =0 ;index<length;index++){
            char opertaororNot = exp.charAt(index);
            if(isOperator(opertaororNot)){
                int firstNumber = st.pop();
                int secondNumber = st.pop();
                int result = performOperation(firstNumber, secondNumber, opertaororNot);
                st.push(result);
                index++;
            }else if(opertaororNot == ' '){
                st.push(num);
                num =0;
            }else{
                num = num * 10 + (opertaororNot - '0');
                if(index+1 ==length){
                    st.push(num);
                }
            }
            
        }
        return st.pop();
      }
    public static boolean isOperator(char c){
        if(c =='+' || c =='-' || c =='*' || c =='/'){
            return true;
        }
        return false;
    }
    public static int performOperation(int firstNumber,int secondNumber,char op){
        
        switch(op){
            case '+':
                return secondNumber+firstNumber;
            case '-':
                return secondNumber - firstNumber;
                
            case '*':
                return secondNumber * firstNumber;
            
            case '/':
                return secondNumber / firstNumber;
                
            default:
                return 0;
           
        }
        
    }
}
