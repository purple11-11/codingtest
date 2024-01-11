function solution(my_string, alp) {
    let upperCase = alp.toUpperCase();
    return my_string.replaceAll(alp, upperCase);
}