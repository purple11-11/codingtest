const solution = (my_string) => {
    let answer = [];
    let trimstr = my_string.trim();
    let str = trimstr.split(/\s+/);
    for (let i = 0; i < str.length; i++) {
        answer[i] = str[i];
    }
    return answer;
   
}
