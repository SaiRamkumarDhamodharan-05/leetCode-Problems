class Solution {
    public int alternateDigitSum(int n) {
      int i=0,sum=0;
      while(n!=0)
      {
        int n1=n%10;
        if (i%2==0) sum+=n1;
        else sum-=n1;
        i++;
        n=n/10;
      }  
      if(i%2==0) return -sum;
      return sum;
    }
}