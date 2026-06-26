class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String s1=new  String();
        for(String w:words)
        {
            s1+=w.substring(0,1);
        }
        return s1.equals(s);
    }
}