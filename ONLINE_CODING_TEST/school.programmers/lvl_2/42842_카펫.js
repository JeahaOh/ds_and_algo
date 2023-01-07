function solution({
  brown,
  yellow
}) {
  let answer = [];
  let sum = brown + yellow;

  // 최소 높이는 3. (위 아래 갈색, 가운데 노란색)
  for (let height = 3; height <= brown; height++) {
    // 합이 높이로 나눌 때 나머지가 없는 경우
    if (sum % height === 0) {
      // 가로 길이
      let width = sum / height;

      // 테두리를 제외한 넓이가 yellow와 같다면 높이와 길이 리턴
      if ((height - 2) * (width - 2) === yellow) {
        return [width, height];
      }
    }
  }

  return answer;
}

const tests = [{
    brown: 10,
    yellow: 2
  },
  {
    brown: 8,
    yellow: 1
  },
  {
    brown: 24,
    yellow: 24
  }
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