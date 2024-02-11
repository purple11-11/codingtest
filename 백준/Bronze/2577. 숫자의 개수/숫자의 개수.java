import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

//        String ABC = "" + (A * B * C); // int to String
        int ABC = A * B * C;
        String[] mulArr = Integer.toString(ABC).split("");

        /* 0으로 된 배열 res */
        int[] res = new int[10];
        for(int i = 0; i < res.length; i++) {
            res[i] = 0;
        }

        for(int i = 0; i < res.length;i++) {
            for(int j = 0; j < mulArr.length;j++) {
                if(i == Integer.parseInt(mulArr[j])) {
                    res[i]++;
                }
            }
        }
        for (int i : res) {
            System.out.println(i);
        }
    }
}