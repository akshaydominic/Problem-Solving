public class SeriesSumI {
    public static void main(String[] args) {
        int num = 3;
        int result = FindSeries(num);
        System.out.println("Result: "+result);

    }
    public static int FindSeries(int num){
        //1x3 + 3 x 5 + 5 x 7 + ..
        //3*5
        //5*7
        int length = num;
        int firstdigit = 1;
        int seconddigit =  firstdigit+2;
        int sum=0;
        for(int index = 0;index<length;index++){
            sum+=firstdigit*seconddigit;
            firstdigit = seconddigit;
            seconddigit = seconddigit+2;
        }
        return sum;
    }
}
