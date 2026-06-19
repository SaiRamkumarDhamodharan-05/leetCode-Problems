class Solution {
    public boolean isIsomorphic(String s, String t) {
      if (s.length() != t.length()) {
            return false;
      }
      char[] s1=s.toCharArray();
      char[] s2=t.toCharArray();
      int[] ms=new int[250];
      int[] mt=new int[250];
      for(int i=0;i<s.length();i++){
        if(ms[s1[i]]!=mt[s2[i]]){
            return false;
        }
        ms[s1[i]]=i+1;
        mt[s2[i]]=i+1;
      }
      return true;
    }
}
