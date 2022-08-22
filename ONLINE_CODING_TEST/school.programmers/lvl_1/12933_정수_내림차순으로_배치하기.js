// 정수 내림차순으로 배치하기

const n = 118372;


function solution(n) {
  return Number(String(n).split('').sort().reverse().join(''));
}

console.log(solution(n));