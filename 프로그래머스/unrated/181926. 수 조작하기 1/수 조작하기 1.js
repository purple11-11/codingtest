const solution = (n, control) => {
    let answer = n;
    let arr = control.split('');
    for(let i = 0; i < arr.length; i++) {
        if(arr[i] == 'w') {
            answer += 1;
        } else if(arr[i] == 's') {
            answer -= 1;
        } else if (arr[i] == 'd') {
            answer += 10;
        } else {
            answer -= 10;
        }
    }
    return answer;
}