function solution(left, right) {
    let answer = 0;
    for(let i = left; i <= right; i++) {
         let x = [];
        for(let j = 1; j <= i; j++) {
            if(i%j === 0) x.push(j)
        }
        answer += x.length%2 === 0? i : -i;
    }
    return answer;
}