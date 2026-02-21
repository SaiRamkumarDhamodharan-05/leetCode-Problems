class Solution {
    public int missingNumber(int[] nums) {
        int sum=0,sum_arr=0,n=nums.length;
        for (int i=0;i<n;i++){
            sum+=i+1;
            sum_arr+=nums[i];
        }
        return sum-sum_arr;
    }
}