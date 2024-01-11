function solution(a, b) {
    // 내 첫 풀이
    // let answer = 0;
    // let sum1 = parseInt(String(a) + String(b));
    // let sum2 = parseInt(String(b) + String(a));
    // sum1 > sum2 ? answer = sum1 : answer = sum2;
    // return answer;
    
    return Math.max(parseInt(`${a}${b}`), parseInt(`${b}${a}`))
}