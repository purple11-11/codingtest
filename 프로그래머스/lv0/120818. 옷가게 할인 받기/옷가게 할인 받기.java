class Solution {
    public int solution(int price) {
        
        // >= (이상)의 조건이므로 가장 큰 수를 첫 번째 조건으로 걸어야 한다.
        // 이하인 경우, 가장 작은 수부터 조건을 지정해야 함.
        if(500000 <= price) {
            return (int)(price * 0.8);
        } else if(300000 <= price) {
            return (int)(price * 0.9);
        } else if(100000 <= price) {
            return (int)(price * 0.95);
        }
        return price;
        
    // 처음에 했던 코드(작은 수 부터 조건으로 적어서 통과 안됨)
        // if(100000 <= price) {
        //     return (int)(price * 0.95);
        // } else if(300000 <= price) {
        //     return (int)(price * 0.9);
        // } else if(500000 <= price) {
        //     return (int)(price * 0.8);
        // }
        // return price;
    }
}