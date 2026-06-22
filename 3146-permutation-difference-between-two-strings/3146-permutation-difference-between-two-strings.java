class Solution {
    public int findPermutationDifference(String s, String t) {
        int perum=0;
        int n=s.length();
        int m=t.length();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(s.charAt(i)==t.charAt(j))
                {
                    perum+=Math.abs(i-j);
                }
            }
        }
        return perum;
    }
}