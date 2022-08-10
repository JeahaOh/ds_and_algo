// 내적

// const a = [1, 2, 3, 4], b = [-3, -1, 0, 2];
const a = [-1, 0, 1],
  b = [1, 0, -1];

// reduce 이용 1줄 코드
// function solution(a, b) {
//   return a.reduce((acc, cur, idx) => acc += (cur * b[idx]), 0);
// }

// 단순 반복문
function solution(a, b) {
  var answer = 0;
  for (let i = 0; i < a.length; i++) {
    answer += ((a[i]) * (b[i]));
  }
  return answer;
}

console.log(solution(a, b));