class Solution {
    public int[] numberGame(int[] nums) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for (int num : nums) {
            list1.add(num);
        }
        int n=list1.size();
        for(int i=0;i<n/2;i++)
        {
            int Amin=Collections.min(list1);
            list1.remove(Integer.valueOf(Amin));
            int Bmin=Collections.min(list1);
            list1.remove(Integer.valueOf(Bmin));
            list2.add(Bmin);
            list2.add(Amin);
        }
        return list2.stream().mapToInt(i -> i).toArray();
    }
}