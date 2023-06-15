import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main (String[] args) {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String id = null;
		try {
			id = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(id+"??!");
	}
	
}
