const solution = (num_list) => {
   
    let mul = num_list.reduce((acc, cur) => {
        return acc * cur;
    });
    let sum = num_list.reduce((acc, cur) => {
        return acc + cur;
    })
    
    return (mul < (sum*sum)) ? 1 : 0;
}