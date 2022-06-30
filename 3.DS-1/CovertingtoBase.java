public class CovertingtoBase {
    public static void main(String[] args) {
        int n=240,b=16;
        String result=CalculateBase(n, b);
        System.out.print("Result "+result);
    }
    public static String CalculateBase(int n, int b){
        int number = n,base =b;

        String result= "";
        int divisor = 0; 
        while( number>=base){
            int remainder = number % base;
            result+=remainder;
            number=divisor=number/base;
        }
        result+=divisor;
        String result1 = reverseStringto(result);
        return result1;
        
    }
    public static String reverseStringto(String n){
       String result = new String();
       for(int index=0;index<n.length();index++){
        result+=n.charAt(n.length()-1-index);
       }
       return result;
    }
}
