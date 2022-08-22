// 자릿수 더하기

// const n = 123;
const n = 987;

function solution(n) {
  return String(n).split('').reduce((acc, cur) => acc += Number(cur), 0);
}

console.log(solution(n));