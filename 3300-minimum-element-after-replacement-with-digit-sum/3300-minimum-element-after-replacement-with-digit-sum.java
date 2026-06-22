class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            while(nums[i]!=0)
            {
                int n1=nums[i]%10;
                sum+=n1;
                nums[i]/=10;
            }
            nums[i]=sum;
        }
        int min=Integer.MAX_VALUE;
        for(int i:nums){
             if(i<min) min=i;
        }
        return min;
    }
}