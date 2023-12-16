function solution(s) {
    let answer = true;
    if(s.length === 4 || s.length === 6) {
    for(let i of s) {
        if(!(0 <= i && i <= 9)) return false;
    }
    return answer;
    }
    return false;
}