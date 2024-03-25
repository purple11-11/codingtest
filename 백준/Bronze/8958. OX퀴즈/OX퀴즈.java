import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거

        for(int t = 0; t < T; t++) {
            String S = sc.next(); 

            int score = 0;
            int getScore = 0;

            for(int i = 0; i < S.length(); i++) {
                // o 일 때마다 getScore++ 된 값을 더함
                if(S.charAt(i) == 'O') {
                    getScore++;
                    score += getScore;

                } else if(S.charAt(i) == 'X') {
                    // x 만나면 getScore = 0
                    getScore = 0;
                }
            }
            System.out.println(score);
        }
        sc.close();
    }
}