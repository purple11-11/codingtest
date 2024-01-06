import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //입력
        // new boolean[41+1]
        boolean visited[] = new boolean[42]; // 배열 길이만큼 boolean 값 들어가있음, N-1개 만들어짐
//        System.out.println(visited); // 주소값 출력됨 -> .toString
//        System.out.println(Arrays.toString(visited));
        int count = 0;
        for(int i = 0; i < 10; i++) {
            int num = sc.nextInt();
//            System.out.println(num);
            // 42의 나머지
            int reamin = num %42;
//            System.out.println(reamin);
//            System.out.println(visited[reamin]);
            if(visited[reamin]) {
                continue; //이미 기록된 나머지이기 때문에 뒤에 작업하지 X
            }
            // if(!visited[remain]) {
            visited[reamin] = true;
            count++;
        }
        System.out.println(count);
    }
}