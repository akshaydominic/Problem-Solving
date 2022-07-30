public class FIndDuplicateOccurence {
    public static void main(String[] args) {
        int[] q= {1,2,2,3,4,5};
        int k =2;
        int result =FIndDuplicateOccurence_sol(q, k);
        System.out.println("Result "+result);

    }
    public static int FIndDuplicateOccurence_sol(int[] a, int k){
        //find first occurence
        int first = first_occurence(a, k);
        if(first == -1){
            return 0;
        }
        int last = last_occurence(a, k);
        return last-first+1;
        //find last occurence
        //return first-last+1
    }
    public static int first_occurence(int[] a,int k){
        int low=0,high=a.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid]==k && (mid==0 || a[mid-1]<k))
            return mid;
            else if(k<=a[mid]){
                high =mid-1;
            }else {
                low = mid+1;
            }
        }
        return -1;
    }
    public static int last_occurence(int[] a,int k){
        int low = 0,high =a.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid]==k && (mid == a.length-1 || a[mid+1]>k))
                return mid;
            else if(k>=a[mid])
            low = mid+1;
            else 
            high = mid-1;

        }
        return -1;
    }
}
