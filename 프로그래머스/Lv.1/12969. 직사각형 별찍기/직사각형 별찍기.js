process.stdin.setEncoding('utf8');
process.stdin.on('data', data => {
    // 입력값 space로 나눠서 배열에 넣기
    const arr = data.split(" ");
    // 입력값 n(가로), m(세로) 변수에 넣기
    const n = Number(arr[0]), m = Number(arr[1]);
    
    // 세로(m)만큼 반복
    for(let i = 0; i < m; i++) {
        // stars 변수 초기화
        let stars = "";
        // 세로 반복문이 한 번 돌아갈 때 마다 가로(n)만큼 반복
        for(let j = 0; j < n; j++) {
            stars += "*";
        }
        // 가로 한 줄 stars 변수에 쌓이면 출력
        console.log(stars);
    }
    // i가 m보다 작을 경우 다음 행의 반복 시작
});