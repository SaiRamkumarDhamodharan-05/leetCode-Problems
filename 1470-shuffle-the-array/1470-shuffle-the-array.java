class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] nums1=new int[2*n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            nums1[k]=nums[i];
            nums1[k+1]=nums[i+n];
            k+=2;
        }
        //System.out.println(Arrays.toString(nums1));
        return nums1;
    }
}