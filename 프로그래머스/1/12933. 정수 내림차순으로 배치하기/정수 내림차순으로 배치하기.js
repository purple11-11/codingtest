function solution(n) {
    let arr = String(n).split('').sort((a, b)=>b-a);
    return parseInt(arr.join(''));
}