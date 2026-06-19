class Solution {
    public int countDigits(int num) {
        int tmp=num,count=0;
        while(tmp!=0)
        {
            int n1=tmp%10;
            if(num%n1 ==0) count++;
            tmp/=10;
        }
        return count;
    }
}