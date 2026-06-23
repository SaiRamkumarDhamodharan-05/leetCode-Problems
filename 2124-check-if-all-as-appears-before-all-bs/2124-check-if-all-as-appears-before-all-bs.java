class Solution {
    public boolean checkString(String s) {
        int k=-1,n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i) == 'b') { k=i;break;}
        }
        if(k==-1) return true;
        for(int i=k;i<n;i++){
            if(s.charAt(i) == 'a') return false;
        }
        return true;
    }
}