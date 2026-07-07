class Solution {
    public int getLeastFrequentDigit(int n) {
        String s=String.valueOf(n);
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        char c=' ';
        int min=Integer.MAX_VALUE;
        Map<Character, Integer> kmap = new TreeMap<>(map);
        for(Map.Entry<Character,Integer> e:kmap.entrySet())
        {
            if(e.getValue()<min)
            {
                min= e.getValue();
                c=e.getKey();
            }
        }
        return Character.getNumericValue(c);
    }
}