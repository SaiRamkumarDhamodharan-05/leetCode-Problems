class Solution {
    public boolean isPalindrome(String s) {
        String s1=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if (Character.isLetterOrDigit(ch)) sb.append(ch);
        }
        System.out.println(sb.toString());
        return sb.toString().equals(sb.reverse().toString());
    }
}