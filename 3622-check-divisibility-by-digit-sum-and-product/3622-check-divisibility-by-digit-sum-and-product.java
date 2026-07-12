class Solution {
    public boolean checkDivisibility(int n) {
        int dp=1,ds=0;
        int a=n;
        while(a!=0)
        {
            int b=a%10;
            ds+=b;
            dp*=b;
            a=a/10;
        }
        if(n%(ds+dp) == 0)  return true;
        return false;
    }
}