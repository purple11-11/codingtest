import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N;
		int result = 1;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			result *= i;
		}
		System.out.println(result);
		
		sc.close();
	}
}
