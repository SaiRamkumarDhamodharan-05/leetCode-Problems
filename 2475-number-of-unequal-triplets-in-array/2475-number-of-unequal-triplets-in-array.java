class Solution {
    public int unequalTriplets(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int k=0;k<n;k++)
        {
            for(int j=0;j<k;j++)
            {
                for(int i=0;i<j;i++)
                {
                    if(nums[i]!=nums[j] && nums[i]!=nums[k] && nums[j]!=nums[k] ) count++;
                }
            }
        }
        return count;
    }
}