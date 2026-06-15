class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words=paragraph.toLowerCase().split("\\W+");
        HashMap<String,Integer> countmap=new HashMap<>();
        Set<String> ban=new HashSet<>(Arrays.asList(banned));
        int max=0,count=0;
        String mostC="";
        for (String w:words)
        {
            if(!ban.contains(w)){
                count=countmap.getOrDefault(w,0)+1;
                countmap.put(w,count);
            }
            if(count>max)
            {
                max=count;
                mostC=w;
            }
        }
        return mostC;
    }
}