function solution(box, n) {
  return box.reduce((acc,num)=>acc * parseInt(num/n), 1)
}