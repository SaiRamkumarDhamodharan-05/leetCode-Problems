class Solution {
    public int minimumOperations(int[] nums) {
        int opCount=0;
        for(int i:nums)
        {
            if(i%3 == 0) continue;
            else
            {
                if((i+1)%3 == 0) {opCount++; continue;}
                if((i-1)%3 == 0) {opCount++; continue;}
            }
        }
        return opCount;
    }
}