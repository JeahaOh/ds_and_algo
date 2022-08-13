// 수박수박수박수...

// function solution(n) {
//   var answer = '';
//   for (var i = 1; i <= n; i++) {
//     if (i % 2 == 0) answer += '박';
//     else answer += '수';
//   }
//   return answer;
// }

const solution = (n) => {
  return '수박'.repeat(Math.ceil(n / 2)).substring(0, n);
}

for (let i = 0; i <= 10; i++) {
  console.log(`${i} : ${solution(i)}`);
}