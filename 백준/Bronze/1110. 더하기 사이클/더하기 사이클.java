import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cp = N;
        sc.close();

        int cnt = 0;

        while (true) {
            N = ((N%10) * 10) + (((N/10) + (N%10)) %10);
            cnt++;
            if(N == cp) {
                break;
            }
        }
        System.out.println(cnt);
    }
}