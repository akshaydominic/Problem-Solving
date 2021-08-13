import java.util.ArrayList;
import java.util.List;

public class StringProb {
//str1 =devakshayjava
//str2= javaakshayreva
//email= manasm@aditiconsulting.com
    public static void main(String[] args) {
        String s1 = "devaakshayjava";
        String s2 = "javaakshayreva";
        List<String> resultString = new ArrayList<String>();
        String result ="";
        int i,j,position=0;
        for(i=0;i<s2.length();i++){
            char temp = s2.charAt(i);
            for(j=position;j<s1.length();j++){
                if(s1.charAt(j)==temp){
                    result+=s1.charAt(j);
                    position=j;
                    position++;
                    break;
                }
            }
            if(j>=s1.length()-1){
                resultString.add(result);
                result="";
                position=0;
            }
            
        }
        // from list selecting the max length substring
        int Max=0;
        String Solution="";
        for(String s:resultString){
            if(s.length()>Max){
                Max = s.length();
                Solution=s;
            }
        }
        // the expected result akshay
        System.out.println(Solution);
        System.out.println(resultString.toString());
        
    }
}
