import java.util.Arrays;
public class Sorting{

    public static void main(String[] args) {
        int[] arr  = new int[]{10,20,30,40,99,1,100};
        display(arr);
        int[] copy = Arrays.copyOf(arr,  arr.length);
        System.out.println("copy");
        display(copy);
        Arrays.sort(copy);
        System.out.println("After sorting");
        display(copy);
        System.out.println("Minimum number : "+copy[0]);
        System.out.println("Maximum number : "+copy[copy.length-1]);
        int number = Arrays.binarySearch(copy, 30);
        System.out.println("Number: "+number);
        sortingTheArray(arr);
        System.out.println("After Sorting function ");
        display(arr);


        
    }
    
    private static void display(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void sortingTheArray(int[] array){
        int temp;
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i=0 ; i<array.length-1 ;i++){
                if(array[i]>array[i+1]){
                    temp = array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                    flag =true;
                }
            }
        }
    }
        
    
}