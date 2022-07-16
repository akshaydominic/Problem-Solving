import java.net.http.HttpRequest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class WaterContainer {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = Solution(height);
        System.out.println(result);
    }
    public static int Solution(int[] height){
       //declare two pointers
       int n = height.length;
       int ptr1=0,ptr2=n-1;
       int maxArea = 0;
       while(ptr1<ptr2){
            int element = Math.min(height[ptr1],height[ptr2]);
            int lengthtower = ptr2-ptr1;
            int sum = element * lengthtower;
            if(sum> maxArea){
                maxArea =sum;
            }
            if(height[ptr1] < height[ptr2]){
                ptr1++;
            }else{
                ptr2--;
            }
       }
       return maxArea;
    }
}
