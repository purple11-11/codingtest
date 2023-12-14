function solution(left, right) {
    let answer = 0;
    let x = [];
    for(let i = left; i <= right; i++) {
        for(let j = 1; j <= i; j++) {
            if(i%j === 0) x.push(j)
        }
    }
    return x;
}