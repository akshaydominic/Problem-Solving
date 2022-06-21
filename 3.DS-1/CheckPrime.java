import java.util.*;;
public class CheckPrime{
    public static void main(String[] args) {
        ArrayList<Integer> questions = new ArrayList<Integer>(Arrays.asList(1,2));
        ArrayList<Boolean> result = checkisPrime(2, questions);
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i)+" ");
        }
        
    }
    public static ArrayList<Boolean> checkisPrime(int t,ArrayList<Integer> nums){
        int sizeofArray = t;
        ArrayList<Boolean> results = new ArrayList<>(sizeofArray);
        for(int index=0;index<sizeofArray;index++){
            if(isPrime(nums.get(index))){
                results.add(true);
            }else{
                results.add(false);
            }
        }
        return results;
    }
    public static boolean isPrime(int target){
        if(target == 1){
            return false;
        }
        for(int index = 2; index < Math.sqrt(target);index++){
            if(target % index == 0){
                return false;
            }
        }
        return true;
    }

}