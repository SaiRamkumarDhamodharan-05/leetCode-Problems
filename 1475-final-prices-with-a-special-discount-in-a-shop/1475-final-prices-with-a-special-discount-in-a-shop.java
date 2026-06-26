class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length,k=0;
        int[] ans=new int[n];
        for(int i=0;i<n;i++)
        {
            int idx=i;
            for(int j=i+1;j<n;j++)
            {
                 if(prices[j] <=prices[i] && j>i) { idx=j;break;} 
            }
            if(idx!=i)
                ans[k++]= prices[i]-prices[idx];
            else
                ans[k++]= prices[i];
        }
        return ans;
    }
}