class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
        int n=candies.length;
        for(int i=0;i<n;i++)
        {
            int temp=candies[i]+extraCandies;
            int max = Arrays.stream(candies).max().getAsInt();
            if( temp>= max) {list.add(true); continue;}
            list.add(false);
        }
        return list;
    }
}