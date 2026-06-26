class Solution {
    public String removeStars(String s) {
        StringBuilder s1=new StringBuilder(s);
        for(int i=1;i<s1.length();i++)
        {
            if(s1.charAt(i) == '*'){
                s1.deleteCharAt(i);
                s1.deleteCharAt(i-1);
                i=i-2;
            }
        }
        return s1.toString();
    }
}