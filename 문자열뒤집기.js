const solution = (my_string) => {
  // return my_string.split("").reverse().join("");
  // .split() : 지정한 구분자로 문자열 나누기
  // .join() : 배열의 모든 요소를 연결해 하나의 문자열로 만듦

  return [...my_string].reverse().join("");
  // [...str] : 스프레드 문법 사용
};
