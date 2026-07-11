class Solution {
    public int maxArea(int[] height) {
        int n=height.length,max=Integer.MIN_VALUE;
        int left=0,right=n-1;
        for(int i=0;i<n;i++)
        {
             int a=Math.abs(left-right)*Math.min(height[left],height[right]);
             if(max<a) max=a;
             if(height[left]<height[right]) left++;
             else right--;
        }
        return max;
    }
}