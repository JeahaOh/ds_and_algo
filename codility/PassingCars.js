/**
 * - N개의 정수, 0, 1로만 이루어진 배열
 * - 0 <= P < Q < N인 pair (P, Q)
 * 문제 독해가 안됨, 다른 사람 코드는 이해 가능...
 */
function solution(A) {
  // 0의 갯수
  let pCount = 0;
  let sum = 0;

  for (let i = 0; i < A.length; i++) {
    if (0 === A[i]) {
      // 0의 갯수를 센다
      pCount++;
    } else {
      // 1 이라면, 0의 갯수를 더한다
      sum += pCount * A[i];

      // 일정 수를 넘으면 종료
      if (sum > 1000000000) return -1;
    }
  }

  return sum;
}

const tests = [
  [0, 1, 0, 1, 1],
  [1],
  [0],
  [1, 0],
  [0, 1],
  [1, 1],
  [0, 0],
  [1, 0, 0, 1, 0, 1, 0]
];

for (const test of tests) {
  console.log('-'.repeat(100));
  console.log('param : ', test, '\n');
  console.log('\n\t->\t', solution(test));
  console.log('-'.repeat(100) + '\n');
}