import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int A = 0;
		int B = 0;
		
		Scanner scan = new Scanner(System.in);
		
		A = scan.nextInt();
		B = scan.nextInt();
		
		int add = A + B;
		System.out.println(add);
		scan.close();
	}
}
