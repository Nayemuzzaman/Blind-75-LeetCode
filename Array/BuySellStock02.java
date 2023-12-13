class BuySellStock02 {
    public static int maxProfit(int[] prices) {
        int singleDayPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i<prices.length; i++){
            if (singleDayPrice>prices[i]){
                singleDayPrice = prices[i];
            } else if ((prices[i]-singleDayPrice)>maxProfit) {
                maxProfit = prices[i] - singleDayPrice;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        int profit = maxProfit(prices);
        System.out.println(profit);
    }


}