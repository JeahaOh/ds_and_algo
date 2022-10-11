function solution(s) {
  var answer = true;

  let count = 0;

  for (let c of s) {
    if (c == '(') {
      count++;
    } else {
      if (count == 0) {
        return false;
      }
      count--;
    }
  }

  return count == 0;
}

const tests = [
  '()()', '(())()', ')()(', '(()('
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