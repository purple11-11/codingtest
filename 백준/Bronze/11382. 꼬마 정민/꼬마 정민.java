import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long A = 0;
		long B = 0;
		long C = 0;
		
		Scanner sc = new Scanner(System.in);
		A = sc.nextLong();
		B = sc.nextLong();
		C = sc.nextLong();
		
		long add = A + B + C;
		
		System.out.println(add);
		sc.close();
	}
}
