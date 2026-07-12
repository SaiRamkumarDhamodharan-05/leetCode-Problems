class Solution {
    public int gcd(int a,int b)
    {
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=0,sumEven=0;
        for(int i=1;i<=n;i++)
        {
            sumOdd+=((2*n) - 1);
            sumEven+=(2*n);
        }
        return gcd(sumOdd,sumEven);
    }
}