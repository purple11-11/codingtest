const solution = (my_string, index_list) => {
    let answer = [];
    let arr = my_string.split('');
    for(let i = 0; i < index_list.length ;i++) {
        answer.push(arr[index_list[i]]);
    }
    return answer.join('');
}