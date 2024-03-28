import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();

        // num1,2 거꾸로 바꾸기
        int result1 = 0, result2=0;
        
        while(num1 != 0 || num2 != 0) {
            result1 = result1 * 10 + num1 % 10;
            num1 /= 10;
            result2 = result2 * 10 + num2 % 10;
            num2 /= 10;
        }
        // 바꾼 수 중 더 큰 수 출력
        System.out.println(Math.max(result1, result2));
    }
}