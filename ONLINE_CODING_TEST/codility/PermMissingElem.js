function solution(A) {
  if (A.length === 0) return 1;

  const sum = A.reduce((acc, cur) => acc += cur, 0);
  const max = A.length + 1;
  const expectedSum = max * (max + 1) / 2;
  return expectedSum - sum;
}

const tests = [
  // empty
  [],
  // single
  [0],
  [1],
  [2],
  // first
  [2, 3, 4, 5],
  // last
  [2, 3, 1, 4],
  // example
  [2, 3, 1, 5],
  // double
  [1, 3],
  [2, 3],

];

for (const test of tests) {
  console.log(test, '\n\t->\t', solution(test));
}