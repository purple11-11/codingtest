import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        sc.close();

        for(int i = 0; i < N; i++) {
            System.out.println("Case #"+(i+1)+": "+A[i]+" + "+B[i]+" = "+(A[i]+B[i]));
        }
    }

}