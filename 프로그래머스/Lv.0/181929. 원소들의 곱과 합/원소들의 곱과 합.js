const solution = (num_list) => {

    let mul = num_list.reduce((total, e) => total * e, 1)
    let sum = num_list.reduce((total, e) => total + e, 0)
    
    return (mul < (sum*sum)) ? 1 : 0;
}