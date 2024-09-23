class Solution {
    public int maxProfit(int[] prices) {
        // int profit = 0;
        // int min =Integer.MAX_VALUE;
        
        // int [] arr = new int[prices.length];                                       
        // for(int i=0;i<prices.length;i++){
        //     min = Math.min(min,prices[i]);
        //     arr[i] = min;
        // }
        // for(int i =0;i<prices.length;i++){
        //     arr[i] = prices[i]-arr[i];
        // }
        // for(int i=0;i<prices.length;i++){
        //     profit = Math.max(profit,arr[i]);
        // }
        // return profit;
        int profit =0;
        int min = prices[0];
        for(int i=1;i<prices.length;i++){
            int cost = prices[i]-min;
            profit = Math.max(cost,profit);
            min = Math.min(min,prices[i]);
        }
        return profit;
    }
}