public class AddingToArrays {
    public static void main(String[] args) {
        int[] digits = {2,7,8,0};
        int[] results = plusOne(digits);
        for(int index=0;index<results.length;index++){
            System.out.print(results[index]+" ");
        }
    }
    static  int[] plusOne(int[] digits) {
        //brute force method check if the last digit is less than 9 then change it 
        // if the number is 9 then resize the array and set lsb to 0 and msb to 1 
        int index = digits.length-1;
               if(digits[index]<9){
                   digits[index] = digits[index] + 1;
               }else{
                //if there are previous nines appearing like 9 9 9 
                   int resultIndex = PreviousNine(index,digits);
                   if(resultIndex > 0){
                       digits[resultIndex] = digits[resultIndex] + 1;
                   }
                   else if(resultIndex == 0 && digits[resultIndex] == 9){
                    digits = new int[digits.length+1];
                    for(int i=0;i<digits.length ; i++){
                        if(i == 0){
                            digits[i]= 1;
                        }else{
                            digits[i] =0;
                        }
                      }
                   }
               }
       return digits;
   }
   static int PreviousNine(int index ,int[] digits){
       while(index >0 ){
           if(digits[index] < 9){
               return index;
           }else{
               digits[index] =0;
               index --;
           }
        }
       return index;
   }
}
