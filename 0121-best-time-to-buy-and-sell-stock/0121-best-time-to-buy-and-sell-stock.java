class Solution {
    public int maxProfit(int[] prices) {
    int  maxprofit =0;
    int  buyprice=prices[0];
    for(int i=0;i<prices.length;i++){
        int currprofit=prices[i]-buyprice;
        if(currprofit>maxprofit){
            maxprofit=currprofit;
        }
        if(prices[i]<buyprice){
            buyprice=prices[i];
        }
    }
    return maxprofit;
    }
}