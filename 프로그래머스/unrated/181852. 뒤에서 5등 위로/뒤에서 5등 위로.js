const solution = (num_list) => {
    let answer = [];
    let sortList = num_list.sort((a,b) => a-b);
    for(let i = 5; i<sortList.length; i++) {
        answer.push(sortList[i]);
    }
    return answer;
}