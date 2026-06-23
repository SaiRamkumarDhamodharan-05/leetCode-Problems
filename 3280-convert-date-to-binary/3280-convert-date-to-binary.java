class Solution {
    public String convertDateToBinary(String date) {
        String[] darr=date.split("-");
        StringBuilder sb=new StringBuilder();
        for(String s:darr)
        {
            sb.append(Integer.toBinaryString(Integer.parseInt(s)));
            sb.append("-");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}