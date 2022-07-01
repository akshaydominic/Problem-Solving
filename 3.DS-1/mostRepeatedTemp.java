import java.util.TreeMap;
import java.util.Collections;
import java.util.Map;

//given an array of temp find the most repeated temp
//using Maps
public class mostRepeatedTemp {
    public static void main(String[] args) {
        int[] arr = {1,-4,-5,-1,-1,3,-5,1,-2,1,2,2,0,2,-2,1,-5,5,4,2};  //2
        int n = arr.length;
        int result = Solution(n, arr);
        System.out.print("Result : "+result);
    }
    public static int Solution(int n,int[] a){
        Map<Integer,Integer> hmp= new TreeMap<Integer,Integer>(Collections.reverseOrder());

        for(int index=0;index<n;index++){
            if(hmp.containsKey(a[index])){
                hmp.put(a[index], hmp.get(a[index])+1);
            }else{
                hmp.put(a[index],1);
            }
        }
        int maxValue = Integer.MIN_VALUE;
        int maxkey=0;
        for(Map.Entry<Integer,Integer> en:hmp.entrySet()){
            if(en.getValue()> maxValue){
                maxValue= en.getValue();
                maxkey = en.getKey();
            }
        }
        int result = maxkey;
        return result;

    }

}
