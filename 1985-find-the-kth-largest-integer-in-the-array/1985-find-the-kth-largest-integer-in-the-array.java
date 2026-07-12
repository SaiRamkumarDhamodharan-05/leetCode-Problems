import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<BigInteger> heap=new PriorityQueue<>();
        for(String i:nums)
        {
            heap.offer(new BigInteger(i));
            if(heap.size()>k) heap.poll();
        }
        return heap.poll().toString();
    }
}