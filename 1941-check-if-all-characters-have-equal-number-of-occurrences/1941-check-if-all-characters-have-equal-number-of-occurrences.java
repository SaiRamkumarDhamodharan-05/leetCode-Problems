class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        Set<Integer> set=new HashSet<>();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> e:map.entrySet())
        {
            set.add(e.getValue());
        }
        return set.size()==1;
    }
}