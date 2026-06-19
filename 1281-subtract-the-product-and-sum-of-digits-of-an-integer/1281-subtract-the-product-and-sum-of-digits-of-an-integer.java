class Solution {
    public int subtractProductAndSum(int n) {
       int pd=1,sd=0;
       while(n!=0)
       {
          int n1=n%10;
          sd+=n1;
          pd*=n1;
          n=n/10;
       }
       return pd-sd;
    }
}