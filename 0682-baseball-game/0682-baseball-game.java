import java.util.ArrayList;

class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < operations.length; i++) {
            String op = operations[i]; 
            if (op.equals("+")) {
                int last = list.get(list.size() - 1);
                int secondLast = list.get(list.size() - 2);
                list.add(last + secondLast);
            } 
            else if (op.equals("D")) {
                int last = list.get(list.size() - 1);
                list.add(2 * last);
            } 
            else if (op.equals("C")) {
                list.remove(list.size() - 1);
            } 
            else {
                list.add(Integer.parseInt(op));
            }
        }
                int totalSum = 0;
        for (int score : list) {
            totalSum += score;
        }
        return totalSum;
    }
}
