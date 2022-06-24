public class TrailingZerofactorial {
    //puzzle multiples of 5 
    public static void main(String[] args) {
        
        int result = TrailingZ(25);
        System.out.println("Result "+ result);
    }
    public static int TrailingZ(int n){
        int result = 0;
        for(int count = 5; count<=n;count=count*5){
            result+= n/count;
        }
        return result;
    }
}
