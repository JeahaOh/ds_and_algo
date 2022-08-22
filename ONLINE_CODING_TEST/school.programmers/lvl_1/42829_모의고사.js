function solution(answers) {
  var answer = [];
  let p1 = [1, 2, 3, 4, 5],
    p2 = [2, 1, 2, 3, 2, 4, 2, 5, ],
    p3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ];

  let p1cnt = answers.filter((a, i) => a === p1[i % p1.length]).length,
    p2cnt = answers.filter((a, i) => a === p2[i % p2.length]).length,
    p3cnt = answers.filter((a, i) => a === p3[i % p3.length]).length;

  const max = Math.max(p1cnt, p2cnt, p3cnt);

  if (p1cnt === max) answer.push(1);
  if (p2cnt === max) answer.push(2);
  if (p3cnt === max) answer.push(3);

  return answer;
}



const tests = [
  [1, 2, 3, 4, 5, ],
  [2, 1, 2, 3, 2, 4, 2, 5],
  [1, 3, 2, 4, 2]
];

for (const test of tests) {
  console.log('param : ', test, '\n');
  console.time();
  console.log('\n\t->\t', solution(test));
  console.timeEnd();
  console.timeLog();
  console.log('-'.repeat(50) + '\n');
}