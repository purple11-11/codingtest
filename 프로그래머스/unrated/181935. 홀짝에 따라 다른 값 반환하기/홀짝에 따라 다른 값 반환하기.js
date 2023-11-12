const solution = (n) => {
    let answer = 0;
    if(n%2 === 1) {
        // n 이하의 홀수인 모든 양의 정수 합 return
        for(let i = 1; i <= n; i += 2) {
            answer += i;
        }
    } else {
        // n 이하의 짝수인 모든 양의 정수 제곱의 합 return 
        for(let i = 0; i <= n; i += 2) {
            answer += i*i; 
        }
    }
    return answer;
}