import java.io.*;

public class Main {

	public static void main (String[] args) throws IOException  {
	
		// BufferedReader와 BufferedWriter 사용
		// BufferedWriter.flush는 맨 마지막 한 번만 하면 된다
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			int a = Integer.parseInt(s.split(" ")[0]);
			int b = Integer.parseInt(s.split(" ")[1]);
			bw.write(a+b+"\n");
		}
		bw.flush();
	}
	
}
