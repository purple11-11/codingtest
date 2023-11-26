function solution(n) {
    let a = [];
    for(let i = 1; i <= n; i++) {
        if(n%i === 0) {
           a.push(i);
        }
    }
    
    let sum = a.reduce((acc, cur) => {
        return acc + cur;
    }, 0) 
    
    return sum;
}