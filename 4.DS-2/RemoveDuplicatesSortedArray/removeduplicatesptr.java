public class removeduplicatesptr {
    public static void main(String[] args) {
        int[] q = {2,2,2,3,4,4,9};
        int n = q.length;
        int r=Solution(q, n);
        System.out.print("Result "+r);
    }
    public static int Solution(int[] arr,int n){
        int ptr1=0,ptr2=1,count=0,validsize=0;
        boolean flag= false;
        while(ptr1<n && ptr2 <n){
            if(arr[ptr1] < arr[ptr2]){
                ptr1++;
                ptr2++;
                continue;
            }else if(count<1){
                count++;
                ptr2++;
                continue;
            }
            if(count ==1){
                int index = ptr2;
                for(int i=0;i<arr.length-1;i++){
                    if(i==index){
                        flag = true;
                    }
                    if(flag){
                        arr[i]=arr[i+1];
                        validsize++;
                    }else{
                        arr[i]=arr[i];
                        validsize++;
                    }
                    // if(i==arr.length-2){
                    //     arr[i+1]=-1;
                    // }
                }
                count =0;
                ptr1 =ptr2;
                ptr2++;
            }
        }
        return validsize;
    }
}
