import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MergeOverLapping {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] results = solution(intervals);
        int rowlength = results.length;
        int columnlength = results[0].length;
        for(int i=0;i<rowlength;i++){
            for(int j=0;j<columnlength;j++){
              System.out.print(results[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] solution(int[][] intervals){
        if(intervals.length<= 1){
            return intervals;
        }
        Arrays.sort(intervals,(array1,array2)->Integer.compare(array1[0], array2[0]));
        List<int[]> result_array = new ArrayList<>();
        int[] current = intervals[0];
        result_array.add(current);
        for(int[] interval: intervals){
            int currentbegin = current[0];
            int currentend = current[1];
            int next_begin = interval[0];
            int next_end = interval[1];
            
            if(currentend >= next_begin){
                current[1]= Math.max(currentend, next_end);
            }else{
                current = interval;
                result_array.add(current);
            }
        }
        return result_array.toArray(new int[result_array.size()][]);
    }
}
