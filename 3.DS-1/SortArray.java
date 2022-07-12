import java.util.ArrayList;
import java.util.Arrays;

public class SortArray {
 public static void main(String[] args) {
    String[] arr = {"abc","abd","ab","a"};
    String[] arr1=Solution(arr.length, arr);
    for(int index=0;index<arr1.length;index++){
        System.out.print(arr1[index]+" ");
    }
 }  
 public static String[] Solution(int n,String[] arr) {
    Arrays.sort(arr,String.CASE_INSENSITIVE_ORDER);
    return arr;
 } 
}
