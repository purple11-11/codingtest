function solution(d, budget) {
    let answer = 0;
    d.sort((a,b) => a - b); // 오름차순 정렬
    for(let i of d) {
        if(budget < i) break; // 예산 초과시 종료
         budget -= i;
         answer++;       
    }
    return answer;
}