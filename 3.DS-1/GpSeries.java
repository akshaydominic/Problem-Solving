public class GpSeries {
    public static void main(String[] args) {
        double A = 1,R=0.5;
        double result = seriesSumII(A, R);
        System.out.print("Result :"+result);

    }
    static double seriesSumII(double A,double R){
        //formula A/(1-R)
        return A/(1-R);
    }

}
