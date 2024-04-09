import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int answer = 0;
        int a = 0, b = 1;

        if (n <= 1) System.out.println(n);

        if (1 < n && n <= 20) {
            for (int i = 2; i <= n; i++) {
                answer = a + b;
                a = b;
                b = answer;
            }
            System.out.println(answer);
        }
    }
}