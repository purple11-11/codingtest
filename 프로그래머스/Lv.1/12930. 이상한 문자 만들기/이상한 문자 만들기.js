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
    // 공백 기준 단어 나누기
    let words = s.split(" ");

    
    for(let i = 0; i < words.length; i++) {
        let word = words[i];
        // 한 단어 안에서 홀수 짝수 구분해서 대소문자 변환하기
        for(let j = 0; j < word.length; j++) {
            (j%2 === 0) ? answer += word[j].toUpperCase() : answer += word[j].toLowerCase();
        }
        // 한 단어의 변환이 끝나면 공백 추가 단! 마지막 단어 뒤에는 넣지 않음.
        if(i !== words.length - 1) answer += " ";
    }
    return answer;
}
