class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double divid = (double)num1 / (double)num2;
        answer = (int)(divid * 1000);
        return answer ;
    }
}