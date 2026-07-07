function solution(n) {
// 1. % 0인 숫자 배열
    const arr = [];
    for(let i = 0; i <= n; i++) {
        if(n%i === 0) {
            arr.push(i);
        }
    }
    // 2. 오름차순 정렬
    return arr.sort((a, b) => a - b);
}