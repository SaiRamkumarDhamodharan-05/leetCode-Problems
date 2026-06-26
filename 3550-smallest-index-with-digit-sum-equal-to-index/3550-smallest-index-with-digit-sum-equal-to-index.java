class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            int a=nums[i];
            while(a!=0)
            {
                int n1=a%10;
                sum+=n1;
                a=a/10;
            }
            if(sum == i) return i;
        } 
        return -1;
    }
}