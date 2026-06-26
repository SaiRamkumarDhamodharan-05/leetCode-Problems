class Solution {
    public String clearDigits(String s) {
        StringBuilder s1=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            if(Character.isDigit(c)) 
            {
                if(s1.length() >0)
                   s1.deleteCharAt(s1.length()-1);
            }
            else s1.append(c);
        }
        return s1.toString();
    }
}