function solution(n, lost, reserve) {
  let answer = n;

  // 각 학생의 유니폼 수
  let hasUniform = new Array(n).fill(1);

  // 잃어버린 학생은 --
  for (let i = 0; i < lost.length; i++) {
    hasUniform[lost[i] - 1]--;
  }

  // 여벌이 있으면 ++
  for (let i = 0; i < reserve.length; i++) {
    hasUniform[reserve[i] - 1]++;
  }

  for (let i = 0; i < hasUniform.length; i++) {
    if (hasUniform[i] === 0) {
      if (hasUniform[i - 1] === 2) {
        hasUniform[i]++;
        hasUniform[i - 1]--;
      } else if (hasUniform[i + 1] === 2) {
        hasUniform[i]++;
        hasUniform[i + 1]--;
      } else {
        answer--;
      }
    }
  }

  return answer;
}

const tests = [{
    n: 5,
    lost: [2, 4],
    reserve: [1, 3, 5]
  },
  {
    n: 5,
    lost: [2, 4],
    reserve: [3]
  },
  {
    n: 3,
    lost: [3],
    reserve: [1]
  },
  {
    n: 7,
    lost: [2, 3, 4],
    reserve: [1, 2, 3, 6]
  },
];

for (const test of tests) {
  console.log('-'.repeat(100));
  console.log('param : ', test, '\n');
  console.time();
  console.log('\n\t->\t', solution(test.n, test.lost, test.reserve));
  console.timeEnd();
  console.timeLog();
  console.log('-'.repeat(100) + '\n');
}