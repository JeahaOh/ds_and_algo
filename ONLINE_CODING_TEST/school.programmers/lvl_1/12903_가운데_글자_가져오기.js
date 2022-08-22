function solution(s) {
  let isEven = s.length % 2 === 0;
  let middle = Math.floor(s.length / 2);

  return isEven ? s.substr(middle - 1, 2) : s[middle];
}


const list = ['abcde', 'qwer', 'asdf', 'qdt', 'q1w2e3r4'];

for (const str of list) {
  console.log(str, solution(str));
}