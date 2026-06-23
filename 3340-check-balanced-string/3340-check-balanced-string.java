class Solution {
    public boolean isBalanced(String num) {
        int osum=0,esum=0;
        int n=num.length();
        for(int i=0;i<n;i++)
        {
            int a=num.charAt(i)-'0';
            if(i%2==0) osum+=a;
            else esum+=a;
        }
        return osum==esum;
    }
}