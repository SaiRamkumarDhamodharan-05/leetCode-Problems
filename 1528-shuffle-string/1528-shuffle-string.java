class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            arr[indices[i]]=s.charAt(i);
        }
        //for(int i=0;i<arr.length;i++)
        return new String(arr);
        //return "sai";
    }
}