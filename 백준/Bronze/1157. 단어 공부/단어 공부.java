import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String T = sc.next();
//        sc.nextLine(); // 개행 문자 제거
        sc.close();

        T = T.toUpperCase();
        if(T.length() == 1) {
            System.out.println(T);
            return;
        }

        // 중복 제거 후 문자 배열 생성
        char[] chars = T.toCharArray();
        Set<Character> charSet = new HashSet<>();
        for( char c : chars) charSet.add(c);

        // 중복 제거한 문자 배열에서 각 문자의 개수 count 배열에 담고, uniqueChars에 해당 문자 담기
        int[] count = new int[charSet.size()];
        char[] uniqueChars = new char[charSet.size()];
        int index = 0;
        for(char c : charSet) {
            int frequency = 0;
            for(char ch: chars) {
                if(c == ch) frequency++;
            }
            count[index] = frequency;
            uniqueChars[index] = c;
            index++;
        }

        // 최댓값 찾기
        int maxCount = Arrays.stream(count).max().getAsInt(); // 최댓값
        int maxCountIndex = -1;
        for(int i = 0; i < count.length; i++) {
            if(count[i] == maxCount) { // 중복 확인을 위해 count 배열의 값과 최댓값 비교
                if(maxCountIndex == -1){ // 값이 같은데 maxCountInt가 -1인 경우
                    maxCountIndex = i;
                } else { // 이전에 최댓값이 등장해 maxCountInt가 -1이 아닌 경우
                    System.out.println("?");
                    return;
                }
            }
        }
        System.out.println(uniqueChars[maxCountIndex]);
    }
}