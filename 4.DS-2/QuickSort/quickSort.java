public class quickSort {
        public static void main(String[] args) {
            int[] q = {13,12,9,5,3,2,1};
            quicksort(q, 0, q.length-1);
            for(int i:q){
                System.out.print(i+" ");
            }
    
        }
        public static void quicksort(int[] arr,int low,int high){
            if(low<high){
                int partion_index = partitionPivot(arr, low, high);
                quicksort(arr, low, partion_index-1);
                quicksort(arr, partion_index+1, high);
                
            }
        }
        public static int partitionPivot(int[] arr,int low,int high){
            int pivot = arr[high];
            int i=low-1;
            for(int index=low;index<high;index++){
                if(arr[index]<pivot){
                    i++;
                    swap(arr, i, index);
                }
    
            }
            i++;
            swap(arr, i, high);
            return i;
            
    
        }
        public static void swap(int[] arr,int i,int j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j] =temp;
        }
    }
