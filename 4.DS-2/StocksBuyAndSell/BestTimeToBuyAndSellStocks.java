public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] q = {1,2,3,4,5};
        int re = Solution(q);
        System.out.print("Result "+ re);

    }
    public static int Solution(int[] prices){
        int length = prices.length;
        int maxProfit = 0;
        for(int index=0;index<length;index++){
            if(index!=length-1){
                int temp = prices[index+1]-prices[index];
                maxProfit+=Math.max(temp, 0);
            }
        }
        return maxProfit;
    } 
}
