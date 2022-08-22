/**
 * {i : A <= i <= B, i / K = 0}
 * A <= B, A ~ B 사이의 정수 중, K로 나누어 0이 되는 수의 갯수 구하기.
 * 단순 반복문, 2,000,000,000 건이면 효율이 떨어질 것 같은데...
 * total 50%
 * task score 50%, correctness 100%, perfomance 0%
 * O(B - A)
 * 예상대로 perfomance test에서 다 fail
 * https://app.codility.com/demo/results/training9T8URK-5ZD/
 */
// function solution(A, B, K) {
//   console.log(A, B, K);
//   const limit = B;
//   let count = 0;

//   for (let i = A; i <= limit; i++) {
//     if (i % K === 0) count++;
//   }

//   return count;
// }

/**
 * googling -> ((B / K) - (A / K)) + 1이 답인 이유를 모름...
 */
function solution(A, B, K) {
  if (A === B) {
    if (A % K === 0) return 1;
    else return 0;
  }
  return (Math.floor(B / K) - Math.ceil(A / K)) + 1;
}

const tests = [{
    A: 6,
    B: 11,
    K: 2
  },
  {
    A: 0,
    B: 1,
    K: 11
  },
  {
    A: 10,
    B: 10,
    K: 5
  },
  {
    A: 100,
    B: 11230000000,
    K: 2
  },
  {
    A: 0,
    B: 2000000000,
    K: 1
  },
];

for (const test of tests) {
  console.log('-'.repeat(100));
  console.log('param : ', test, '\n');
  console.time();
  console.log('\n\t->\t', solution(test.A, test.B, test.K));
  console.timeEnd();
  console.timeLog();
  console.log('-'.repeat(100) + '\n');
}