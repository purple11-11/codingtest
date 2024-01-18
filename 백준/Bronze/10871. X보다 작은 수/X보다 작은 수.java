import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] a = new int[N];
        
        for(int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        
        for(int i : a) {
            if(i < X) {
                System.out.print(i + " ");
            }
        }
    }
}