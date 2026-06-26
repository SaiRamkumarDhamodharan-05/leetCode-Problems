class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count=0;
        int n=arr.length;
        for(int k=0;k<n;k++)
        {
            for(int j=0;j<k;j++)
            {
                for(int i=0;i<j;i++)
                {
                    if(Math.abs(arr[i]-arr[j]) <= a && Math.abs(arr[j]-arr[k]) <=b && Math.abs(arr[i]-arr[k]) <=c ) count++;
                }
            }
        }
        return count;
    }
}