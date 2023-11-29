function solution(n) {
    let answer = [];
    let str = String(n).split('');
    for(let i = str.length - 1; i >= 0; i--) {
        answer.push(parseInt(str[i]));
    }

    return answer;
}