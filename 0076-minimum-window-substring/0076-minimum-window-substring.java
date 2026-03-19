class Solution {
    public String minWindow(String s, String t) {
       if(s.length()<t.length())
       {
         return "";
       }
       int[] freq=new int[128];
       for(char c:t.toCharArray())
       {
        freq[c]++;
       }
       int left=0,right=0;
       int start=0,minLen=Integer.MAX_VALUE;
       int count=t.length();
       while(right<s.length())
       {
         if(freq[s.charAt(right)]>0)
             count--;
         freq[s.charAt(right)]--;
         right++;
         while(count==0){
         if(right-left<minLen)
         {
            minLen=right-left;
            start=left;
         }
         freq[s.charAt(left)]++;
        if(freq[s.charAt(left)]>0)
             count++;
        left++;
         }
       }
       if(minLen==Integer.MAX_VALUE)
          return "";
       return s.substring(start,start+minLen);
    }
}