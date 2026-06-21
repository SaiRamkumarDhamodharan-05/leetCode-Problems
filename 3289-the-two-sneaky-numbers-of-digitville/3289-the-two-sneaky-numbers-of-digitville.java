class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length,k=0;
        int[] ans=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue()==2)
            {
                ans[k++]=entry.getKey();
            }
        }
        return ans;
    }
}