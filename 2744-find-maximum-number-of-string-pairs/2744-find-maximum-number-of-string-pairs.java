class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int n=words.length,count=0;
        for(int j=0;j<n;j++)
        {
            for(int i=0;i<j;i++)
            {
                StringBuilder sb1=new StringBuilder(words[j]);
                StringBuilder sb2=new StringBuilder(words[i]);
                if(sb1.reverse().compareTo(sb2) == 0) count++;
                sb1.reverse();
            }
        }
        return count;
    }
}