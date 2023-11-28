function solution(n)
{
    let num = String(n).split('');
    let answer = num.reduce((acc,cur) => {
        return acc + (cur*1);
    },0)

    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    console.log('Hello Javascript')

    return answer;
}