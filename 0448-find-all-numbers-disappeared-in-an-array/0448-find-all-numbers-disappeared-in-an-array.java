class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        Set<Integer> arr= new HashSet<>();
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<n;i++)
        {
             arr.add(nums[i]);
        }
        for(int i=1;i<=n;i++)
        {
            if(!arr.contains(i)) list.add(i);
        }
        return list;
       
    }
}