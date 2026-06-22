class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n=nums.length,count=0;
        if(n==1) return true;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]%2==0){
                if(nums[i+1]%2!=0) count++;
            }
             if(nums[i]%2!=0){
                if(nums[i+1]%2==0) count++;
            }
        }
        return count==(n-1);
    }
}