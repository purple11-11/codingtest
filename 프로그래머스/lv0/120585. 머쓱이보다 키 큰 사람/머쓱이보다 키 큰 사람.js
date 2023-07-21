/*function solution(array, height) {
    let result = 0;
    for(; array.length; ){
        if(arr[]-h<0){
            result++;
        } else
            return 0;
    }
    return result;
}
*/
function solution(array, height) {
  return array.filter(a => a > height).length;
}

/* 하고싶었던 것
function solution(array, height) {
    var answer = 0;
    for (let i = 0; i < array.length; i++) {
        if (array[i] > height) {
            answer++
        }
    }
    return answer;
}
*/