import java.util.ArrayList;
import java.util.HashMap;

public class largestsubarray {
    public static void main(String[] args) {
        int[] arr = {2,3,1,-4,0,6};
        ArrayList<Integer> sol = Solution(arr);
        System.out.println(sol.toString());

    }
    public static ArrayList<Integer> Solution(int[] arr){
        int n =arr.length;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        hmap.put(0, -1);
        int sum=0,maxlength=0,s=0;
        for(int i=0;i<n;i++){
            //check if element exist or not
            sum+=arr[i];
            if(hmap.containsKey(sum)){
                int previousLength = hmap.get(sum);
                int l= i-previousLength;
                if(l>maxlength){
                    maxlength=l;
                    s=previousLength+1;
                }
            }else{
                hmap.put(sum, i);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        if(maxlength ==0){
            result.add(-1);
            return result;
        }
        for(int i=s;i<s+maxlength;i++){
            result.add(arr[i]);
        }
        return result;
    }
}
