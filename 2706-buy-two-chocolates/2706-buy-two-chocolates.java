class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int cst = prices[0] + prices[1] ;
        if(money >= cst){
            return money - cst ;
        }
        return money;
    }
}