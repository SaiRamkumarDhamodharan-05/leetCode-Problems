class Solution {
    public boolean areNumbersAscending(String s) {
        String[] words=s.split("\\s+");
        int prev=-1;
        for (String item : words) {
            if (isAllDigits(item)) {
                  int current=Integer.parseInt(item);
                  if(prev>=current) return false;
                  prev=current;
            }
       }
       return true;
    }
    public  boolean isAllDigits(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
