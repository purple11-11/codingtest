function solution(x) {
    let answer = true;
    let arr = String(x).split("");
    let sum = 0;
     for(let i = 0; i < arr.length; i++) {
        sum += parseInt(arr[i]);
    } 
    return (x%sum === 0) ? true : false;
}