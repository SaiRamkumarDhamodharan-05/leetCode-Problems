class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=Integer.MIN_VALUE,maxC=Integer.MIN_VALUE;
        for (int i=0;i<sentences.length;i++)
        {
            count=sentences[i].split("\\s+").length;
            if(count>maxC) maxC=count;
        }
     return maxC;
    }
}