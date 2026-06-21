class Solution {
    public boolean canAliceWin(int[] nums) {
        int alice=0,bob=0;
        int alice1=0,bob1=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<10) alice+=nums[i];
            else bob+=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>10) alice1+=nums[i];
            else bob1+=nums[i];
        }
        return (alice>bob || alice1>bob1);
    }
}