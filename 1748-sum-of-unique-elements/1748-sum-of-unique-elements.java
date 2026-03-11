class Solution {
    public int sumOfUnique(int[] nums) {
          int k=0;
          int[] u=new int[nums.length];
          for(int i=0;i<nums.length;i++)
          {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count+=1;
                }
            }
              if(count==1){
                     u[k]=nums[i];
                     k++;
                }
          }
          System.out.println(Arrays.toString(u));
          return Arrays.stream(u).sum();
    }
}