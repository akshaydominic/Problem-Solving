import java.util.Arrays;
public class StringSort {
    public static void main(String[] args) {
        String[] q={"1","5","4","2"};
        String[] result =sortstringSol(q);
        for(String s:result){
            System.out.print(s+" ");
        }
    }
    public static String[] sortstringSol(String[] arr){
        Arrays.sort(arr,(left,right)->{
            if(left.length()!=right.length())
                return left.length()-right.length();
            return left.compareTo(right);
        });
        return arr;
    }
}

