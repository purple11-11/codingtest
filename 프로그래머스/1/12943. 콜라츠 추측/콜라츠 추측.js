function solution(num) {
    let loopCount = 0;

    while(num > 1 && loopCount <= 500) {
        if(num%2 === 0) {
            num = num/2;
        } else {
            num = (num*3) + 1;
        }
          loopCount++;
    }
    
   if(num === 1) {  
       return loopCount;
    } else {
        return -1;
    }
    
}