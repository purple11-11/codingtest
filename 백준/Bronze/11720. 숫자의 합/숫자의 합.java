import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String A = sc.next();

        sc.close();

        int sum = 0;
        for(int i = 0; i < N; i++) {
            sum += A.charAt(i) - '0'; // String to int(문자열에서 각 문자를 숫자로 변환하여 합산)
            // OR
            // sum += A.charAt(i) - 48;
            // 문자의 ASCII 코드에서 정수 값 48('0')을 빼면 해당 문자에 대응하는 숫자 값을 얻을 수 있다.
        }

        System.out.print(sum);
    }

}