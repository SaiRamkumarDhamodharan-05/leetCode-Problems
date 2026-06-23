class Solution {
    public int firstUniqChar(String s) {
         Map<Character, Integer> map = new LinkedHashMap<>();
        char[] chr=s.toCharArray();
        char a=' ';
        for(char c:chr)
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue()==1) {
                a = entry.getKey();
                break; 
            }
        }
         for(int i=0;i<chr.length;i++)
        {
            if(a==chr[i])
            {
                return i;
            }
        }
        return -1;
    }
}