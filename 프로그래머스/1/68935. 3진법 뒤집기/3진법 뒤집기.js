function solution(n) {
    let trit = n.toString(3);
    let reverseT = trit.split("").reverse().join("");
    
    return parseInt(reverseT, 3);
}