function solution(t, p) {
    let answer = 0;
    let arr = [];
    // 부분 문자열
    for(let i = 0; i <= t.length - p.length; i++) {
        arr.push(t.split("").splice(i, p.length).join(""));
    }
    
    for(let i of arr) {
        if(i <= p) answer++;
    }
    return answer;
}