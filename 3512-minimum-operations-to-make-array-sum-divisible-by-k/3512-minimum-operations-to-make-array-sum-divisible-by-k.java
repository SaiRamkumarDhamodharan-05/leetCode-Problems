class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=IntStream.of(nums).sum();
        return sum%k; 
    }
}