class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] rightMax=new int[n];
        rightMax[n-1]=prices[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(prices[i],rightMax[i+1]);
        }

        int maxProfit=0;
        int profit=0;
        for(int i=0;i<n;i++){
            profit=rightMax[i]-prices[i];
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
        
    }
}
