import java.util.Stack;

public class ReverseWord {
    public static void main(String[] args) {
        String q= "hello  world";
        //result= world hello
        String ans = Solutions(q);
        System.out.print(ans.toString());

    }
    public static String Solutions(String s){
        Stack<String> st= new Stack<>();
        String temp="";
        for(int i=0;i<s.length();i++){
            char element= s.charAt(i);
            if(element!=' '){
                temp+=element;
            }else{
               
                st.push(temp);
                temp="";
            }
        }
        st.push(temp);

        String result="";
        int index=0;
        while(index<st.size()){
            if(index+1 ==st.size()){
                result+=st.pop();
            }else{
                result+=st.pop()+" ";
            }
        }
        return result;
    }
}
