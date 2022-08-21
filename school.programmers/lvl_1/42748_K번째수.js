function solution(array, commands) {
  let answer = [];

  for (const [i, j, k] of commands) {
    const partition = array.slice(i - 1, j).sort((a, b) => a - b);
    answer.push(partition[k - 1]);
  }

  return answer;
}

const tests = [{
    arr: [1, 5, 2, 6, 3, 7, 4, ],
    commands: [
      [2, 5, 3, ],
      [4, 4, 1, ],
      [1, 7, 3, ]
    ]
  },
  {
    arr: [1],
    commands: [
      [1, 1, 1, ],
      []
    ]
  },
];

for (const test of tests) {
  console.log('param : ', test, '\n');
  console.time();
  console.log('\n\t->\t', solution(test.arr, test.commands));
  console.timeEnd();
  console.timeLog();
  console.log('-'.repeat(50) + '\n');
}