function solution(A, K) {
  if (!A.length) return A;

  for (let i = 0; i < K; i++) {
    A.unshift(A.pop());
  }
  return A;
}

const tests = [{
  A: [3, 8, 9, 7, 6],
  K: 3
}, {
  A: [0, 0, 0],
  K: 1
}, {
  A: [1, 2, 3, 4],
  K: 4
}, {
  A: [],
  K: 1
}, ]

for (const test of tests) {
  console.log(test, '\n\t-> ', solution(test.A, test.K));
}