const solution = (my_string) => {
    let answer = '';
    answer = my_string.replace(/a/g, '');
    answer = answer.replace(/e/g, '');
    answer = answer.replace(/i/g, '');
    answer = answer.replace(/o/g, '');
    answer = answer.replace(/u/g, '');
    return answer;
    // === return my_string.replace(/[aeiou]/g, '');
}