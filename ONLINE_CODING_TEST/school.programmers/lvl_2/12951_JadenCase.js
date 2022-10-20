function solution(s) {
  s = s.toLowerCase();
  var answer = '';
  let flag = true;

  for (let c of s.split('')) {
    if (flag) c = c.toUpperCase();

    answer += c;

    flag = (c === ' ') ? true : false;
  }

  return answer;
}

const tests = ["3people unFollowed me", "for the last week"];

for (const test of tests) {
  console.log('-'.repeat(100));
  console.log('param : ', test, '\n');
  console.time();
  console.log('\n\t->\t', solution(test));
  console.timeEnd();
  console.timeLog();
  console.log('-'.repeat(100) + '\n');
}