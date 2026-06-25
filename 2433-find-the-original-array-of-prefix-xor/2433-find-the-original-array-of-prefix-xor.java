class Solution {
    public int[] findArray(int[] pref) {
        int n=pref.length;
        int[] arr=new int[n];
        arr[0]=pref[0];
        for(int i=1;i<n;i++)
        {
            int xor=pref[i-1];
            xor^=pref[i];
            arr[i]=xor;
        }
        return arr;
    }
}