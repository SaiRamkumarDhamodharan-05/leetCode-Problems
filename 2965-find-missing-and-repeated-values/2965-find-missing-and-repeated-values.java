class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] nums=new int[2];
        int n=grid.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int[] row:grid)
        {
            for(int i:row)
            {
                map.put(i,map.getOrDefault(i,0)+1);
                set.add(i);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
             if (entry.getValue()==2) {
                nums[0] = entry.getKey();
                break; 
             }
        }
        for(int i=1;i<=n*n;i++)
        {
            if(set.add(i))
            {
                nums[1]=i;
                break;
            }
        }
        return nums;
    }
}