const solution = (array) => {
    // 오름차순 정렬
    const arrSort = array.sort((a,b) => a-b);
    
    // 배열의 중앙값 return
    return arrSort[Math.floor(arrSort.length/2)];
}