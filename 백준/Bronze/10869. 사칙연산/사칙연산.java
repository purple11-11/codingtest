import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int A = 0;
		int B = 0;
		
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		int add = A + B;
		int minus = A - B;
		int mul = A * B;
		int div = A / B;
		int remain = A % B;
		
		System.out.println(add);
		System.out.println(minus);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(remain);
		sc.close();
	}
}
