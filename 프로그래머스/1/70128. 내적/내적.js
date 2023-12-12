function solution(a, b) {
    let answer = 0;
    let cal = [];
    for(let i = 0; i < a.length; i++) {
        cal.push(a[i] * b[i]);
    }
    
    return cal.reduce((acc, cur) => acc + cur, 0);
}