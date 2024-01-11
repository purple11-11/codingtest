// function solution(s) {
//     let answer = [];
//     let arr = s.toLowerCase().split(" ");
//     for(let i = 0; i < arr.length; i++) {
//         for(let j = 0; j < arr[i].length; j++) {
//             if(j%2 === 0) answer += arr[i][j].toUpperCase();
//             else answer += arr[i][j];
//         }
//             answer += " ";
//     }
//     return answer;
// }

function solution(s) {
    let answer = '';
    let words = s.split(" ");
    
    for (let i = 0; i < words.length; i++) {
        let word = words[i];
        for (let j = 0; j < word.length; j++) {
            if (j % 2 === 0) {
                answer += word[j].toUpperCase();
            } else {
                answer += word[j].toLowerCase();
            }
        }
        
        if (i !== words.length - 1) {
            answer += " ";
        }
    }
    
    return answer;
}
