function solution(n) {
    let answer = '';
    for(let i = 0; i < n; i++) {
       i%2 !== 0 ? answer += '박' : answer += '수';
    }
    return answer;
}