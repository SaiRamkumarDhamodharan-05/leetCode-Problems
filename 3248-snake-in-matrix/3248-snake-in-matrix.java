class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int r=0,c=0;
         for(String s:commands)
         {
            if(s.equals("UP")) r--;
            if(s.equals("DOWN")) r++;
            if(s.equals("RIGHT")) c++;
            if(s.equals("LEFT")) c--;
         }
         return (r*n)+c;
    }
}