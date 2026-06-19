class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set=new HashSet<>();
        char[] St=sentence.toCharArray();
        for(char ch:St) set.add(ch);
        return set.size()==26;
    }
}