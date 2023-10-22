const solution = (num_list, n) => {
    let answer = []; 
    let m = 0;
    for(let i = n-1; i < num_list.length;i++) {     
        answer[m++] = num_list[i];
    }
    return answer;
}