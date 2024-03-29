import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] num = new int[N];
        for(int i = 0; i < N; i++) {
            num[i] += sc.nextInt();
        }
        sc.close();

        Arrays.sort(num);

        for(int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}