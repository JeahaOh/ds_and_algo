// 정수 제곱근 판별

const n = 121;
// const n = 3;

function solution(n) {
  var sqrt = Math.sqrt(n);
  if (sqrt % 1 !== 0) return -1;

  return (sqrt + 1) ** 2
}

console.log(solution(n));