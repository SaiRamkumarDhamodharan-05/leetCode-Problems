class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int k=0;
    int[] nums3=new int[nums1.length+nums2.length];
    for(int i=0;i<nums1.length;i++)
      nums3[k++]=nums1[i];
    for(int i=0;i<nums2.length;i++)
      nums3[k++]=nums2[i]; 
    System.out.println(k); 
    Arrays.sort(nums3);
    if(k%2!=0)
       return (double)nums3[k/2];
    else
       return (double)(nums3[(k-1)/2]+nums3[k/2])/2;
    }
}