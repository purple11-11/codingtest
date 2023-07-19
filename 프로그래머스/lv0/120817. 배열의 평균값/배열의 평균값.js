/*function solution(numbers) {
  return numbers.reduce((a, c) => a + c, 0) / numbers.length;
}*/

function solution(numbers) {
    return numbers.reduce((sum, current) => sum + current, 0) / numbers.length;
}