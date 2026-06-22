class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int a=x;
        while(a!=0)
        {
            int n1=a%10;
            sum+=n1;
            a/=10;
        }
        if(x%sum==0) return sum;
        return -1;
    }
}