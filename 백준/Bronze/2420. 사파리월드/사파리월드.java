import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long N;
		long M;
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		long famous = N - M;
		if(famous > 0) {
			System.out.println(famous);
		} else
			System.out.println(famous * -1);
		
		sc.close();
	}
}
