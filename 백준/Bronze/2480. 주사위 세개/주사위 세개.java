import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        sc.close();

        int result = 0;
        int[] numArr = {num1, num2, num3};
        int max = Arrays.stream(numArr).max().getAsInt();

        if(num1 == num2 && num2 == num3) {
            result = 10000 + (num1*1000);
        } else if (num1 == num2 || num1 == num3){
            result = 1000 + (num1*100);
        } else if (num2 == num3){
            result = 1000 + (num2*100);
        } else {
            result = max * 100;
        }
        System.out.println(result);
    }
}
