function solution(a, b) {
    let answer = 0;
    let sum1 = parseInt(String(a) + String(b));
    let sum2 = parseInt(String(b) + String(a));
    sum1 > sum2 ? answer = sum1 : answer = sum2;
    return answer;
}