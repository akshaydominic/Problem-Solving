
import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimumMeetingRooms {
    public static void main(String[] args) {
        int[][] intervals = {{0,20},{5,10},{10,15}};
        int result = solution(intervals);
        System.out.println(result);
        
    }
    public static int solution(int[][] intervals){
        if(intervals.length ==0){
            return 0;
        }
        Arrays.sort(intervals,(arr1,arr2)->Integer.compare(arr1[0], arr2[0]));
        //[0,20][5,10][10,15]
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        int first_meeting = intervals[0][1];
        minheap.add(first_meeting);
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=minheap.peek()){
                minheap.poll();
            }
                int endtime_meeting = intervals[i][1];
                minheap.add(endtime_meeting);
            
        }
        return minheap.size();
        
    }
}
