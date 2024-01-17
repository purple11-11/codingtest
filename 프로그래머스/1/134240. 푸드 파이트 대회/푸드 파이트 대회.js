function solution(food) {
    let answer = [];
    for(let i = 1; i < food.length; i++) {
        if(food[i]%2 === 0) for(let j = 0; j < Math.floor(food[i]/2); j++) answer.push(i);
        else for(let k = 0; k <Math.floor(food[i]/2); k++) answer.push(i);
    }
    return answer.join("") + "0" + answer.reverse().join("") ;
}