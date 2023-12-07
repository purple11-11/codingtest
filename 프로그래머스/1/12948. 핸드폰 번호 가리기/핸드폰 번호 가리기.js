function solution(phone_number) {
    let answer = phone_number.replace(/\d{4}/g, '*');
    return answer;
}