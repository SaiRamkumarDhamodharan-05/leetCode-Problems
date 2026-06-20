class Solution {
    public int GCD(int a, int b)
    {
        if(b==0) return a;
        return GCD(b,a%b);
    }
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        for(int i:nums)
        {
            if(max<i) max=i;
            if(min>i) min=i;
        }
        int result=GCD(min,max);
        return result;
    }
}