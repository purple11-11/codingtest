import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int start, int end) {
        
        ArrayList<Integer> arrList = new ArrayList<Integer>(10);
        
        for(int i = start; i <= end; i++) {
            arrList.add(i);
        }
        return arrList;
    }
}