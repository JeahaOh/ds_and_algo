/**
 * total score 100%
 * task, correctness, performance -> 100%
 */
function solution(A) {
  const set = new Set([...A]);
  return set.size;
}

const tests = [
  [2, 1, 1, 2, 3, 1],
  [2, 1, 1, 2, 3, 1],
];

for (const test of tests) {
  console.log('-'.repeat(100));
  console.log('param : ', test, '\n');
  console.time();
  console.log('\n\t->\t', solution(test));
  console.timeEnd();
  console.timeLog();
  console.log('-'.repeat(100) + '\n');
}