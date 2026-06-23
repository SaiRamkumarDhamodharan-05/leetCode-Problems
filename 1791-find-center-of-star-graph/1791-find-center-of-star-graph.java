class Solution {
    public int findCenter(int[][] edges) {
      HashMap<Integer,Integer> map=new HashMap<>();
      int n=edges.length;
      for(int[] row:edges)
      {
        for(int i:row)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
      }
      int c=-1;
      for(Map.Entry<Integer,Integer> e:map.entrySet())
      {
        if(e.getValue() == n) c=e.getKey();
      }
      return c;
    }
}