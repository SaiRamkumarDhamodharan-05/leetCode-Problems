class Solution {
    public int maxProduct(int n) {
        int maxp=0,k=0;
        int[] arr=new int[String.valueOf(n).length()];
        while(n!=0)
        {
            int a=n%10;
            arr[k++]=a;
            n=n/10;
        }
        int n1=arr.length;
        for(int i=0;i<n1;i++)
        {
            int p=1;
            for(int j=i+1;j<n1;j++)
            {
                p=arr[i]*arr[j];
                if(maxp<p) maxp=p;
            }
        }
        return maxp;
    }
}