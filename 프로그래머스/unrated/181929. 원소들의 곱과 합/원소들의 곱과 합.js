const solution = (num_list) => {
   
    let mul = num_list.reduce((acc, cur) => {
        return acc * cur;
    });
    let sum = num_list.reduce((acc, cur) => {
        return acc + cur;
    })
    let dSum = sum * sum;
    if(mul < dSum) {
        return 1;
    } else {
        return 0;
    }
    
}