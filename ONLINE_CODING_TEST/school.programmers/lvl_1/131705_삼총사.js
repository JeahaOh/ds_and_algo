function solution(number) {
  let ans = [];
  let numArr = number;
  let N = number.length;
  let resultCnt = 0;

  const dfs = (idx, depth) => {
    if (depth == 3) {
      let sum = 0;

      for (let i = 0; i < 3; i++) {
        sum += ans[i];
      }

      if (sum == 0) {
        resultCnt++;
      }

      return;
    }

    for (let i = idx; i < N; i++) {
      ans[depth] = numArr[i];
      dfs(i + 1, depth + 1);
    }
  }

  dfs(0, 0);

  return resultCnt;
}

const tests = [
  [-2, 3, 0, 2, -5],
  [-3, -2, -1, 0, 1, 2, 3],
  [-1, 1, -1, 1]
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