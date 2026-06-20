class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=2;i<=num;i++)
        {
            int a=i;
            int sum=0;
            while(a!=0)
            {
                int a1=a%10;
                sum+=a1;
                a=a/10;
            }
            if(sum%2==0) count++;
        }
        return count;
    }
}