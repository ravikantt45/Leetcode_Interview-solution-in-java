class Solution {
    public int findmin(int[] prices, int idx) {
       
        for (int j = idx + 1; j < prices.length; j++) {
            if (prices[j]<=prices[idx]) {
                return j;
            }
        }
        return -1; 
    }
    public int[] finalPrices(int[] prices) {
         int[] ans = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int discountIndex = findmin(prices, i);
            int discount = (discountIndex != -1) ? prices[discountIndex] : 0;
            ans[i] = prices[i] - discount;
        }
        return ans;
    }
}