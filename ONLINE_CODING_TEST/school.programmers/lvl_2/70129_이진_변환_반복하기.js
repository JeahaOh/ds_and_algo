function solution(s) {
  let countZero = 0;
  let transCount = 0;
  while (s > 1) {
    let originLength = s.length;
    s = s.replace(/0/g, '');
    countZero += originLength - s.length;
    s = s.length.toString(2);
    transCount++;
  }
  return [transCount, countZero];
}

const tests = [
  '110010101001',
  '01110',
  '1111111',
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