import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int A = 0;
		int B = 0;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		int mul = A * B;
		System.out.println(mul);
		sc.close();
	}
}
