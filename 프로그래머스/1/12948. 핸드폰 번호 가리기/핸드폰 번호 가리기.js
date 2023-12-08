function solution(num) {
    var answer = '';
    for(let i = 0; i < num.length; i++) {
        i < num.length - 4 ? answer += num.replace(/^[0-9]*$/g, '*') : answer += num[i]
    }
    return answer;
}