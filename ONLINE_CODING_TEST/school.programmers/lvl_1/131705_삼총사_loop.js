function solution(number) {
  var answer = 0;

  for (let i = 0; i < number.length - 2; i++) {
    for (let j = i + 1; j < number.length - 1; j++) {
      for (let k = j + 1; k < number.length; k++) {
        if (number[i] + number[j] + number[k] == 0) {
          answer++;
          break;
        }
      }
    }
  }


  return answer;
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