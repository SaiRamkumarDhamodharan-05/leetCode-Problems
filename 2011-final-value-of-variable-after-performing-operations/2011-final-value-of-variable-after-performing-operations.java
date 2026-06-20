class Solution {
    public int finalValueAfterOperations(String[] op) {
        int x=0;
        for(String s:op)
        {
            if(s.equals("--X")) --x;
            else if(s.equals("++X")) ++x;
            else if(s.equals("X--")) x--;
            else x++;
        }
        return x;
    }
}