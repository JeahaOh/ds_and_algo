function solution(N) {
  const binaryNum = N.toString(2);
  const binaryGaps = binaryNum.slice(binaryNum.indexOf('1') + 1, binaryNum.lastIndexOf('1'));
  const zeroCounts = binaryGaps.split('1').map(str => str.length);

  return zeroCounts.length ? Math.max(...zeroCounts) : 0;
}

const tests = [1041, 15, 32];

for (const test of tests) {
  console.log(test, solution(test))
}