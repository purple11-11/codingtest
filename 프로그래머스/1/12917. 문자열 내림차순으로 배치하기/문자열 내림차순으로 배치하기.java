import java.util.*;

class Solution {
    public String solution(String s) {
        // 문자배열로 변환
        char[] arr = s.toCharArray();
        
        // 배열 정렬(오름차순)
        Arrays.sort(arr);
        
        // 배열 reverse
        for(int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        
        // 배열의 요소들을 문자열로 결합하여 반환
        return new String(arr);
    }  
}
