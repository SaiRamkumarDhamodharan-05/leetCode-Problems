class Solution {
    public int differenceOfSum(int[] nums) {
        int eSum=Arrays.stream(nums).sum();
        int sum=0;
        for (int i:nums)
        {
            while(i!=0)
            {
                int a=i%10;
                sum+=a;
                i=i/10;
            }
        }
        return Math.abs(eSum-sum);
    }
}