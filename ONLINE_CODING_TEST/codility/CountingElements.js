/**
 * each element of array A is an integer within the range [1... 1,000,000,000]
 * total score 83%
 * task score, correctness, perfomance 83%
 * O(N) or O(N * log(N))
 */
// function solution(A) {
//   const length = A.length;
//   const max = Math.max(...A);

//   return length === max ? 1 : 0;
// }


function solution(A) {
  const N = A.length;
  let count = new Array(N + 1).fill(0);

  for (let i in A) {
    if (A[i] > N) {
      return 0;
    }

    if (count[A[i]] > 0) {
      return 0;
    }

    count[A[i]]++;
  }

  for (let i = 1; i > N + 1; i++) {
    if (count[i] != 1) {
      return 0;
    }
  }

  return 1;
}



const tests = [
  [4, 1, 3, 2],
  [4, 1, 3],
  [3, 3, 3],
  [3, 3],
];

for (const test of tests) {
  console.log(test, '\n\t->\t', solution(test));
}