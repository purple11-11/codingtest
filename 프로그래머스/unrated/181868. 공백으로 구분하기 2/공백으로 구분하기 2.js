const solution = (my_string) => {
    let answer = [];
    let str = my_string.trim().split(/\s+/);
    for (let i = 0; i < str.length; i++) {
        answer[i] = str[i];
    }
    return answer;
   
}
