class Solution {
    public int findLucky(int[] arr) {
       int n=arr.length;
       HashSet<Integer> set=new HashSet<>();
       for(int i=0;i<n;i++)
       {
        int count=0;
        for(int j=0;j<n;j++)
        {
            if(arr[i]==arr[j]) count++;
        }
        if(count==arr[i]) set.add(arr[i]);
       } 
       if(set.size()==0) return -1;
       System.out.println(set.toString());
       return Collections.max(set);
    }
}