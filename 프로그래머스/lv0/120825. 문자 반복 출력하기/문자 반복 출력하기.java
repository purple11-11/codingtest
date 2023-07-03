import java.util.StringTokenizer;

public class Solution {

    public String solution(String my_string, int n) {
        String answer = "";
        StringTokenizer stk = new StringTokenizer(my_string);
        
        for(int i = 0; i < my_string.length(); i++) {
        	for(int j = 1; j <= n; j++) {
        		answer += my_string.charAt(i);
        	}
        }
       
        return answer;
    }
}
