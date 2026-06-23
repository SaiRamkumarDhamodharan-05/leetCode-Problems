class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        for(int i=0;i<n;i++)
        {
            int mul=1;
            for(int j=i;j<n;j++)
            {
                mul*=nums[j];
                max = Math.max(max, mul);
            }
        }
        return max;
    }
}