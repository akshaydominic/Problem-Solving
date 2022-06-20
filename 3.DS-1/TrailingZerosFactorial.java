class TrailingZerosFactorial{
    public static void main(String[] args) {
        System.out.println(FindTrailing(10));
    }
    private static int FindTrailing(int n) {
        //factorial 1*2*3*4

        int result = 1,i=1;
        if(n == 0){
            return 1;
        }
        while(i<=n){
            result = result * i;
            i++;
        }
        System.out.println("Factorial "+result);
        i=0;
        while((result % 10)==0){
                i++;
                result = result / 10;
        }
        return i;
    }
}