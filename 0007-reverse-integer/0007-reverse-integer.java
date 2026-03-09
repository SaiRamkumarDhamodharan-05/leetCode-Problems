class Solution {
    public int reverse(int x) {
        int y=x;
        int rev=0;
        while(y!=0){
            int a=y%10;
            if(rev<Integer.MIN_VALUE/10 || rev>Integer.MAX_VALUE/10) return 0;
            rev=rev*10+a;
            y=y/10;
        }
        return rev;
    }
}