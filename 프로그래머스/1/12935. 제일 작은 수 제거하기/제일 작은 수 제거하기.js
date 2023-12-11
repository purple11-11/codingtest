function solution(arr) {
    var answer = [];
    min = Number.MAX_SAFE_INTEGER;
    if(arr.length <= 1) answer = [-1]
    else {
        for(let i = 0; i < arr.length; i++) {
            if(min > arr[i]) min = arr[i]
        }
        answer = arr.filter((e) => e !== min)
    }
    
    return answer;
}