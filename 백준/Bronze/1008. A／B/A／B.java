import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double A = 0;
		double B = 0;
		
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		double div = A / B;
		System.out.println(div);
		sc.close();
	}
}
