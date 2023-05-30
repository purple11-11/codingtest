const solution = (num_list) => {
    let answer = [];
    let even = []; //짝수
    let odd = []; //홀수
    
    for(let i = 0; i < num_list.length; i++) {
        if(num_list[i] % 2 === 0) {
            even.push(num_list[i]);
        } else {
            odd.push(num_list[i]);
        }            
    }
    
    answer.push(even.length);
    answer.push(odd.length);
    return answer;
}