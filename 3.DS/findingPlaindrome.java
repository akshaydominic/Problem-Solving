public class findingPlaindrome {
    public static void main(String[] args) {
        System.out.println(Palindrome(343)); 
    }
    public static boolean Palindrome(int n){
        int temp = n;
        int result = 0;
        while(temp>0){
            int lastDigit = temp % 10;
            result = result * 10 + lastDigit; 
            temp = temp /10;
        }
        return result == n;
    }
}
