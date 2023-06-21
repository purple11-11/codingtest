import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 1) {
                arrList.add(i);
            }
        }
        return arrList;
    }
}