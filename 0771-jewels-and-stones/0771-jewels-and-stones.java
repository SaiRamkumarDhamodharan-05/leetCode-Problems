class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] a=jewels.toCharArray();
        char[] b=stones.toCharArray();
        int count=0;
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if (a[j]==b[i]) count++;
            }
        }
        return count;
    }
}