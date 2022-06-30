public class BigintegerAddition {
    public static void main(String[] args) {
        String num1= "10" , num2 ="34";
        String result = AddBigInteger(num1, num2);
        System.out.print("Result: "+result);

    }

    public static String AddBigInteger(String num1, String num2){
        
        if(num1.length() > num2.length()){
            String temp;
            temp = num2;
            num2 = num1;
            num1 = temp;
        }
        // always  num2 is greater
        int maxsize = num2.length();
        int[] number1 = new int[maxsize];
        int[] number2 = new int[maxsize];
        //each element has to be put inside the array
        for(int i=0;i<num1.length();i++){
            number1[i] = num1.charAt(num1.length()-1-i)-'0';
        }
        for(int i=0;i<num2.length();i++){
            number2[i] = num2.charAt(num2.length()-1-i)-'0';
        }
        //10 34  01 43 
        int[] sum= new int[maxsize+1];
        int carry =0;
        for(int i=0;i<maxsize;i++){
            sum[i] = (number2[i] + number1[i] +carry) % 10;
            if((number2[i]+number1[i]+carry) >=10){
                carry = 1;
            }else{
                carry = 0;
            }
        }
        String Solution = new String();
        for(int j=maxsize;j>=0;j--){
            Solution+=sum[j];
        }
        return Solution.substring(1);


        

    }
    
}
