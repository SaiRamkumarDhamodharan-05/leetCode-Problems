class Solution {
    public boolean checkGoodInteger(int n) {
        int ds=0;
        int ss=0;
        while(n!=0){
            int n1=n%10;
            ds+=n1;
            ss+=n1*n1;
            n/=10;
        }
        return ss-ds>=50;
    }
}