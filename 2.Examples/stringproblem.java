import java.util.ArrayList;
import java.util.List;

//str1 =devakshayjava
//str2= javaakshayreva
//email= manasm@aditiconsulting.com

public class stringproblem {
    public static void main(String[] args) {
        String s1="devakshayjava";
        String s2="javaakshayreva";
        int i,j,position=0;
        List<String> resultlist = new ArrayList<String>();
        for(i=0;i<s2.length();i++){
            String result="";
            char c=s2.charAt(i); //j
            for(j=position;j<s2.length();j++){
                if(position>=s1.length()){
                    position=0;
                    resultlist.add(result);
                }
                if(s1.charAt(j)==c){ //j
                    result+=s1.charAt(j); //[j]
                    position=j;
                    break; //j:9
                }
            }
            
        }
        System.out.println(resultlist.toString());

    }


}