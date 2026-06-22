class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String ss:arr)
        {
            StringBuilder sb1=new StringBuilder(ss);
            sb.append(sb1.reverse().toString());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}