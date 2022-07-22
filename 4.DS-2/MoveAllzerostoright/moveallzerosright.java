import java.util.Arrays;
import java.util.Vector;

public class moveallzerosright {
    public static void main(String[] args) {
        Vector<Integer> q = new Vector<>(Arrays.asList(5));
        Vector<Integer> r=solutionformoveallzerostoright(q);
        
    }
    public static Vector<Integer> solutionformoveallzerostoright(Vector<Integer> vec){

        Vector<Integer> result = new Vector<>();
        if(vec.size()==1){
            result.add(vec.get(0));
            return result;
        }
        int count =0 ;
        for(int i:vec){
            if(i!=0){
                result.add(i);
            }else{
                count++;
            }
        }
      
        for(int i=0;i<count;i++){
            result.add(0);
        }
        return result;
    }
}
