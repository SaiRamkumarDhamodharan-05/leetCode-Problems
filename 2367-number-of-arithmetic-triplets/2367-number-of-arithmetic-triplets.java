class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int n=nums.length;
        int count=0;;
        for(int k=n-1;k>=0;k--)
    {
        for(int j=k-1;j>=0;j--)
        {
            for(int i=j-1;i>=0;i--)
            {
                if(nums[k]-nums[j] == diff && nums[j]-nums[i] == diff ) count++;
            }
        }
    }
    return count;
    }
}