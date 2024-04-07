import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        sc.close();
        
        int answer = 0;
        for(int i = 0; i < N.length(); i++) {
            char a = N.charAt(i); // 문자로 직접 비교하기 위해 char형으로 변환
            if('A' <= a && a <= 'C') answer += 3;
            if('D' <= a && a <= 'F') answer += 4;
            if('G' <= a && a <= 'I') answer += 5;
            if('J' <= a && a <= 'L') answer += 6;
            if('M' <= a && a <= 'O') answer += 7;
            if('P' <= a && a <= 'S') answer += 8;
            if('T' <= a && a <= 'V') answer += 9;
            if('W' <= a && a <= 'Z') answer += 10;
        }
        System.out.println(answer);
    }
}