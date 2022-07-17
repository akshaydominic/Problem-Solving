import java.util.HashMap;
import java.util.HashSet;

public class LongestSub {
    public static void main(String[] args) {
        String s = "aabcccbcb";
        int result = solution(s);
        System.out.println(result);
        
    }
    public static int solution(String s){
        int n = s.length();
        int firstpointer = 0;
        int secondpointer = 0;
        int maxSum =0;
        HashSet<Character> hSet = new HashSet<>();
        while(secondpointer<n){
            if(!hSet.contains(s.charAt(secondpointer))){
                hSet.add(s.charAt(secondpointer));
                maxSum = Math.max(hSet.size(),maxSum);
                secondpointer++;
            }else{
                hSet.remove(s.charAt(firstpointer));
                firstpointer++;
            }
        }
        return maxSum;
    }
}
