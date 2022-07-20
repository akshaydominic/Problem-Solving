import java.util.Arrays;
import java.util.HashMap;
import java.util.Vector;

public class findSubarraysum {
    public static void main(String[] args) {
        Vector<Integer> arr = new Vector<>(Arrays.asList(4,2,-2,5));
        String result= SolutionFindSubarray0(arr);
        System.out.println(result);
    }
    public static String SolutionFindSubarray0(Vector<Integer> arr){
        int[] totalarray = new int[arr.size()];
        int total = arr.elementAt(0);
        totalarray[0]=total;
        for(int i=1;i<arr.size();i++){
            total = totalarray[i]=arr.elementAt(i)+total;
        }
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<totalarray.length;i++){
            if(totalarray[i]==0){
                return "Yes";
            }
            if(hmap.containsKey(totalarray[i])){
                return "Yes";
            }else{
                hmap.put(totalarray[i], 1);
            }
        }
        return "No";
    }
    
    
}
