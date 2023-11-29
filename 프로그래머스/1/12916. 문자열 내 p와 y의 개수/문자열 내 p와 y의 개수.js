function solution(s){
    let str = s.toUpperCase();
    let countP = 0;
    let countY = 0;
    for(let i = 0; i < s.length; i++) {
        if(str[i] === "P") {
            countP++;
        } else if (str[i] === "Y") {
            countY++;
        }
    }

    return (countP === countY) ? true : false;
}