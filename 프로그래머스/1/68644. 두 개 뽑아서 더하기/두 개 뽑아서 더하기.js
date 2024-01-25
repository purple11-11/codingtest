function solution(numbers) {
    let answer = [];
    for(let i = 0; i < numbers.length-1; i++) {
        for(let j = 1; j < numbers.length;j++) {
            if(i !== j) {
            answer.push(numbers[i] + numbers[j]);                
            }
        }
    }
    answer = answer.sort((a,b)=> a-b);

    let arr = [answer[0]];
    for(let i = 0; i < answer.length-1; i++) {
        if(answer[i] != answer[i+1]) arr.push(answer[i+1])
    }
    answer = arr;
    
    return answer;
}