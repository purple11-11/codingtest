function solution(n) {
    let sqrt = Math.sqrt(n);
    return Math.pow(Math.floor(sqrt), 2) === n? Math.pow((sqrt+1),2) : -1;
}