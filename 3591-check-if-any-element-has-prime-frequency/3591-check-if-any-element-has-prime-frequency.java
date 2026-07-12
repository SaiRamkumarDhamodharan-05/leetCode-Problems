class Solution {
    public boolean isPrime(int a)
    {
        if(a<=1) return false;
        if(a==2) return true;
        if(a%2==0) return false;
        for (int i = 3; i * i <= a; i += 2) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            if(isPrime(e.getValue())) return true;
        }
        return false;
    }
}