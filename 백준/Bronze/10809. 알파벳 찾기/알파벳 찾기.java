import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();

        // -1로 채워진 배열 생성
        int[] arr = new int[26];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        for(int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i); // char 추출
            /*
                charAt()?
                : String 타입의 데이터(문자열)에서 특정 문자를 char 타입으로 변환할 때 사용하는 함수
             */
            if(arr[ch - 'a'] == -1) { // arr 배열이 -1일 때 실행할 문: 입력받은 문자열 S에 동일한 char가 있는 경우, 첫번째 등장하는 char의 인덱스를 적용하기 위해
                arr[ch - 'a'] = i; // 추출한 char에서 'a' 아스키값을 빼면 인덱스로 사용 가능
            }
        }
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}