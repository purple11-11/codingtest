function solution(angle) {
    if(0<angle && angle <90){
        return 1;
    } else if (angle === 90){
        return 2;
    } else if (90 < angle && angle <180) {
        return 3;
    } else
        return 4;
}
/*
function solution(angle) {
    if(angle === 180){
        return 4;
    } else if(angle > 90){
        return 3;
    } else if (angle === 90){
        return 2;
    }
    return 1;
}*/
/*
function solution(angle) {
    if(angle < 90){
        return 1
    }else if(angle === 90){
        return 2
    }else if(angle < 180){
        return 3
    }else {
        return 4
    }
    return false
}*/