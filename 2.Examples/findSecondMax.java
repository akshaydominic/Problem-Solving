public class findSecondMax{
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        int result = SecondMax(array);
        System.out.println("Second Maximum : "+result);
    }
    public static int SecondMax(int[] array){
        int Maximum = array[0];
        int SecondMax = array[0];
        for(int i=0 ; i<array.length ;i++){
            if(array[i] > Maximum){
                SecondMax = Maximum;
                Maximum = array[i];
            }
            if((array[i] > SecondMax) &&(array[i]!=Maximum)){
                SecondMax = array[i];
            }
        }
        return SecondMax;
    }
    
}