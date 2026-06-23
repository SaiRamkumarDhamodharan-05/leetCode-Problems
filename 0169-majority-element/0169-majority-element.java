class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
             map.put(i,map.getOrDefault(i,0)+1);
        }
        int a=Collections.max(map.values());
        int Key=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (a==entry.getValue()) {
                 Key = entry.getKey();
                break; 
            }
        }
        return Key;
    }
}