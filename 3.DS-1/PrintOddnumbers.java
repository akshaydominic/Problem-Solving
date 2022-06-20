import java.util.*;;
public class PrintOddnumbers {
    public static void main(String[] args) {

        ArrayList<Integer> results = oddNumbers(5);
        for(int index = 0;index< results.size();index ++){
            System.out.print(results.get(index)+" ");
        }

        
    }
    public static ArrayList<Integer> oddNumbers(int n){
        ArrayList<Integer> results = new ArrayList<>();
        for(int index=1;index<=n;index++){
            if(index % 2 !=0){
                results.add(index);
            }
        }
        return results;
    }
    
}

