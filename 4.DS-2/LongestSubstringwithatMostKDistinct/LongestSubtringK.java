import java.util.HashMap;

public class LongestSubtringK {
    public static void main(String[] args) {
        //abacd
        String q = "abacd";
        int result = sol(3, q);
        System.out.println(result);
        
    }
    public static int sol(int k,String s){
        int slow=0,fast=0;
        int result=0;
        HashMap<Character,Integer> hMap = new HashMap<>();
        while(fast<s.length()){
            char element = s.charAt(fast);
            hMap.put(element, hMap.getOrDefault(element,0)+1);
            while(hMap.size() > k){
                char d = s.charAt(slow);
                if(hMap.get(d)==1){
                    hMap.remove(d);
                }else{
                    hMap.put(d,hMap.get(d)-1 );
                }
                slow++;
            }
            result = Math.max(result,fast-slow+1);
            fast++;
        }
        return result;
    }
}
