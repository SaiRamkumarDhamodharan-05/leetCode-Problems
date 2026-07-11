class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        for(int[] row:matrix)
        {
            for(int i:row)
            {
                heap.add(i);
            }
        }
        for(int i=0;i<k-1;i++) heap.poll();
        return heap.poll();
    }
}