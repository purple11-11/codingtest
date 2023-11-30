function solution(n) {
    let arr = String(n).split('').sort().reverse();
    return parseInt(arr.join(''));
}