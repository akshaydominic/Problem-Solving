public class CoprimesN {
    public static void main(String[] args) {
        int n = 9;
        int results = CoPrime(n);
        System.out.print("Number of Coprimes "+results);

    }

    public static int CoPrime(int n){
        int result= 0;
        for(int i=1;i<=n;i++){
            if(isCoprime(i, n)){
                result++;
            }
        }
        return result;
    }

    public static boolean isCoprime(int a,int b){
        return gcd(a,b) == 1;
    }
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}

