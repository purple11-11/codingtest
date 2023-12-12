function solution(a, b) {
//     let cal = [];
//     for(let i = 0; i < a.length; i++) {
//         cal.push(a[i] * b[i]);
//     }
    
//     return cal.reduce((acc, cur) => acc + cur, 0);
    let sum = 0;
    for(let i = 0; i < a.length; i++) {
        sum += a[i] * b[i];
    }
    return sum;
}