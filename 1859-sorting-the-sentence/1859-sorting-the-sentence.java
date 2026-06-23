class Solution {
    public String sortSentence(String s) {
        String[] arr=s.split(" ");
        StringBuilder sb =new StringBuilder();
        int n=arr.length;
        String[] ans=new String[n];
        int k=0;
        int[] indices=new int[n];
       for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                indices[k++]=(c-'0') -1;
            }
       }
       for(int i=0;i<n;i++)
       {
            ans[indices[i]]=arr[i].substring(0,arr[i].length()-1);
       }
       for(String s1:ans){ sb.append(s1); sb.append(" ");}
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}