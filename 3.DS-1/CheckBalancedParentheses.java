import java.util.Stack;

public class CheckBalancedParentheses {
    public static void main(String[] args) {
        String s = "(((){}[]"; //[)
        String ans = isValid(s);
        System.out.print("Result :"+ans);
    }
//     Open brackets must be closed by the same type of brackets.( can be closed by ) only

// Open brackets must be closed in the correct order. ([]) is valid, ([)] is not.


    public static String isValid(String s){
        Stack<Character> st = new Stack<>();
        if(s.isEmpty()){
            return "true";
        }
        for(int index=0;index<s.length();index++){
            if(s.charAt(index)=='[' || s.charAt(index)=='{' || s.charAt(index)=='('){
                st.push(s.charAt(index));
            }else{
                //check for correct parenthesis
                if(st.isEmpty()){
                    return "false";
                }
                char pa = s.charAt(index);
                char check;
                switch(pa){
                    case ')':
                        check = st.pop();
                        if(check =='[' || check =='{'){
                            return "false";
                        }
                        break;
                    case ']':
                        check = st.pop();
                        if(check == '(' || check=='{'){
                            return "false";
                        }
                        break;
                    case '}':
                        check = st.pop();
                        if(check == '(' || check =='['){
                            return "false";
                        }
                        break;

                }
            }
        }
        if(st.isEmpty()){
            return "true";
        }else{
            return "false";
        }
    }

}
