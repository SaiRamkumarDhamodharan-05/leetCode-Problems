class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] nums2 = Arrays.copyOf(nums,nums.length);
        int[] ans = new int[nums.length+nums2.length];
        System.arraycopy(nums,0,ans,0,nums.length);
        System.arraycopy(nums2,0,ans,nums.length,nums2.length);
        return ans;
    }
}