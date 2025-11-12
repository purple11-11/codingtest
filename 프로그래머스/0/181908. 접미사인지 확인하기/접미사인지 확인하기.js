function solution(my_string, is_suffix) {
    const count = my_string.length
    
    for(let i = 0;i<= count;i++) {
        if(my_string.substr(i) === is_suffix){
            return 1;
        }
    }
        return 0;
}