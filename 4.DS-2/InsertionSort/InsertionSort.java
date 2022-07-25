public class InsertionSort {
    public static void main(String[] args) {
        int[] q ={5,3,2,1};
        int[] result = insertionSortSol(q);
        for(int i:result){
            System.out.print(i+" ");
        }

    }
    public static int[] insertionSortSol(int[] arr){
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;                    
            }
            arr[j+1]=current;
            
        }
        return arr;
    }
}