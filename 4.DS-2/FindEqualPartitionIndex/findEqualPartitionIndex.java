public class findEqualPartitionIndex {
        public static void main(String[] args) {
            long[] q={1,2,6,4,0,-1};
            int solution = FindEqualPartitionIndexSol(q);
            System.out.print("Index "+solution);
    
        }
        public static int FindEqualPartitionIndexSol(long[] arr){
            if(arr.length <=2){
                return -1;
            }
            long totalsum=0,length=arr.length;
            for(int index=0;index<length;index++){
                totalsum+=arr[index];
            }
            long[] sum= new long[arr.length];
            long totalsum_array=0;
            for(int index=0;index<length;index++){
                totalsum_array+=arr[index];
                sum[index]=totalsum_array;
            }
            //start from 1 upto n-1 to iterate left and right elements
            for(int i=1;i<length-1;i++){
                long leftSum = sum[i]-arr[i];
                long rightSum = totalsum-sum[i];
                if(leftSum == rightSum){
                    return i;
                }
            }
            return -1;
        }
}

