const solution = (num_list) => {
    let i = num_list.length - 1;
    
        if(num_list[i-1] < num_list[i]) {
            num_list.push(num_list[i] - num_list[i-1]);
         } else {
            num_list.push(num_list[i] * 2);
         }   
    return num_list;
}