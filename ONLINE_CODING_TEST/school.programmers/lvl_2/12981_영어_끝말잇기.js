function solution(n, words) {
  let answer = [0, 0];
  let list = [];
  let curr, prev;

  for (let i = 0; i < words.length; i++) {
    curr = words[i];

    if (i > 0) {
      prev = words[i - 1];

      // 이전에 등장 했는가?
      let isDupl = list.includes(curr);
      // 끝믈 잇기가 맞는가?
      let isWordChain = prev[prev.length - 1] == curr[0];

      if (isDupl || !isWordChain) {
        answer[0] = (i % n) + 1;
        answer[1] = Math.floor(i / n) + 1;
        break;
      }
    }

    list.push(curr)
  }

  return answer;
}

const tests = [{
    n: 3,
    words: ["tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"]
  },
  {
    n: 5,
    words: ["hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"]
  },
  {
    n: 2,
    words: ["hello", "one", "even", "never", "now", "world", "draw"]
  },
];

for (const test of tests) {
  console.log('-'.repeat(100));
  console.log('param : ', test, '\n');
  console.time();
  console.log('\n\t->\t', solution(test.n, test.words));
  console.timeEnd();
  console.timeLog();
  console.log('-'.repeat(100) + '\n');
}