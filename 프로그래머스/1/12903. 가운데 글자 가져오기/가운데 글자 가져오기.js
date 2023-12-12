function solution(s) {
    let answer = '';
    let mid = s.length/2;
    s.length%2 !== 0 ? answer = s.substr(mid, 1) : answer = s.substr(mid-1, 2);
    return answer;
}