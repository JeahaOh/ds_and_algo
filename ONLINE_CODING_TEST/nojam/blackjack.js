// nojam 2798 blackjack
//let input = require('fs').readFileSync('/dev/stdin').toString().split('\n');
// let input = `5 21
// 5 6 7 8 9`;
let input = `10 500
93 181 245 214 315 36 185 138 216 295`
input = input.toString().split('\n');
console.log(input);

input[0] = input[0].split(' ');

// N은 총 카드의 개수
const N = Number(input[0][0]);

// M은 3개의 숫자의 합과 가장 가꾸운 목표 값
const M = Number(input[0][1]);

console.log(`N : ${N}, M : ${M}`);

// cards
const cards = input[1].split(' ').map((ele) => Number(ele));

console.log('cards : ', cards);

let answer = 0;

for (let i = 0; i < N; i++) {
  for (let j = i + 1; j < N; j++) {
    for (let k = j + 1; k < N; k++) {
      const sum = cards[i] + cards[j] + cards[k];

      const gap = M - sum;
      // 합이 M을 넘지 않으며, 카드의 3장의 합이 M에 최대한 가까운 합
      if (0 <= gap && answer <= sum) {
        answer = sum;
      }
    }
  }
}

console.log(answer);