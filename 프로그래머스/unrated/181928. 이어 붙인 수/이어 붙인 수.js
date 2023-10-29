const solution = (num_list) => {
    let answer = 0;
    let a = [];
    let b = [];
    for(let i = 0; i < num_list.length; i++) {
        if(num_list[i] % 2 !== 0) {
            a.push(num_list[i]);
        } else {
            b.push(num_list[i]);
        }
    }
    
    const oddSum = parseInt(a.join(''));
    const evenSum = parseInt(b.join(''));
    
    return answer = oddSum + evenSum;
}
