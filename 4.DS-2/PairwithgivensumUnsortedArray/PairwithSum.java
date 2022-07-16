import java.util.HashMap;

public class PairwithSum {
    public static void main(String[] args) {
        int[] q= {2,4,5,9,8};
        int target=7;
        int[] re = Solution(q, target);
        for(int i=0;i<re.length;i++){
            System.out.print(re[i]+" ");
        }
        
    }   
    public static int[] Solution(int[] nums,int target){
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int[] result = new int[2];
        hmap.put(nums[0], 0);
        for(int i=1;i<nums.length;i++){
            int requiredValue = target- nums[i];
            if(hmap.containsKey(requiredValue)){
                result[0]=hmap.get(requiredValue);
                result[1]=i;
                return result;
            }else{
                hmap.put(nums[i], i);
            }
        }
        return result;
    } 
}
