class Solution {
    public boolean judgeCircle(String moves) {
        int x=0,y=0;
        for(char i:moves.toCharArray())
        {
            if(i=='U') x++;
            if(i=='D') x--;
            if(i=='L') y--;
            if(i=='R') y++;
        }
        return x==0 && y==0;
    }
}