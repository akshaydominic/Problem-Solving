import java.util.Map;
import java.util.TreeMap;

public class FrequencyString {
    public static void main(String[] args) {
        String s1= "AAAAaaaa";
        Object[] result = mostFrequents(s1);
        System.out.println(result[0]+" "+result[1]);
    }
    static Object[] mostFrequents(String s){
        TreeMap<Character,Integer> treemp = new TreeMap<Character,Integer>();
        for(int index=0;index<s.length();index++){
            Character ch =s.charAt(index);
            if(treemp.containsKey(ch)){
               treemp.put(ch, treemp.get(ch)+1); 
            }else{
                treemp.put(ch, 1);
            }
        }
       
        int maxValue = 0;
        char maxCar=' ';
        for(Map.Entry<Character,Integer> e:treemp.entrySet()){
            if(e.getValue()> maxValue){
                maxValue = e.getValue();
                maxCar = e.getKey();
            }
        }

        Object[] re = {maxCar,maxValue};
        return re;
    
    }
}
// return more the frequency and if there are two values than return the lowest ASCII value
