public class KadansAlgorithm {
    
        public static void main(String[] args) {
            int[] q = {-1000000000,-1000000000};
            long sum = kadaneAlgoSolution(q);
            System.out.println("Result "+sum );
    //-1000000000
    //-1000000000
        }
        public static long kadaneAlgoSolution(int[] arr){
            int size = arr.length;
            long max_so_far = Long.MIN_VALUE;
            long max_ending_here = 0;
      
            for (int i = 0; i < size; i++)
            {
                max_ending_here =(long) max_ending_here + arr[i];
                if (max_so_far < max_ending_here)
                    max_so_far = max_ending_here;
                if (max_ending_here < 0)
                    max_ending_here = 0;
            }
            return max_so_far;
        }
        
        //4 2 -2 5
    
 }
