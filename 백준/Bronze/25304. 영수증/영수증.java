import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int count = sc.nextInt();

        for(int i = 0; i < count; i++) {
            int P = sc.nextInt();
            int N = sc.nextInt();
            total -= P*N;
        }
        sc.close();

        if(total == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}