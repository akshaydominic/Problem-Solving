public class findingPlaindrome {
    public static void main(String[] args) {
        boolean result = Palindrome(343);
        System.out.println(result); 
    }
    public static boolean Palindrome(int n){
        int result = 0;
        while(n>0){
            result = n %10;
            n = n/10;
        }
        if(result == n){
            return true;
        }else{
            return false;
        }
    }
}
