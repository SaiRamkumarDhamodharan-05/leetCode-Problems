class Solution {
    public double minimumAverage(int[] nums) {
        int k=0;
        int n=nums.length;
        List<Integer> num = new ArrayList<>();
        for (int i : nums) {
            num.add(i);
        }
        double[] avg = new double[n / 2]; 
        for(int i=0;i<n/2;i++)
        {
            int min = num.stream().min(Integer::compare).get();
            int max = num.stream().max(Integer::compare).get();
            num.remove(Integer.valueOf(min));
            num.remove(Integer.valueOf(max));
            avg[k++]=(min+max)/2.0;
        }
        return Arrays.stream(avg).min().getAsDouble();
    }
}