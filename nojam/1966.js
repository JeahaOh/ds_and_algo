// const path = process.platform === 'linux' ? '/dev/stdin' : 'input.txt'
// const input = require('fs').readFileSync(path).toString().trim().split('\n');

let input = `
3
1 0
5
4 2
1 2 3 4
6 0
1 1 9 1 1 1
`.trim().split('\n');

const [n, ...testcases] = input;

function solution(n, testcases) {
  for (let i = 0; i < n; i++) {
    let count = 1;
    let M = Number(testcases[i * 2].split(' ')[1]);
    const queue = testcases[i * 2 + 1].split(' ').map(i => Number(i))

    while (true) {
      const shiftItem = queue.shift();

      if (Math.max(...queue) <= shiftItem && M === 0) {
        // queue의 max가 꺼낸 값보다 작거나 같고, 목료 index가 0이면
        // -> count 출력, break
        console.log(count);
        break;
      } else if (Math.max(...queue) > shiftItem && M === 0) {
        // queue의 max가 꺼낸 값보다 크고, 목표 index가 0이면,
        // 대기열 뒤로 보내고, M을 queue의 마지막으로 변경
        queue.push(shiftItem);
        M = queue.length - 1;
      } else if (Math.max(...queue) > shiftItem) {
        // queue의 최대가 꺼낸 것 보다 크다면,
        // -> 대기열 뒤로 보내고 M을 하나 줄임
        queue.push(shiftItem);
        M--;
      } else if (Math.max(...queue) <= shiftItem) {
        // queue의 최대가 꺼낸 것 보다 작거나 같다면,
        // -> count를 올리고 M을 줄인다.
        count++;
        M--;
      }
    }
  }
}

solution(n, testcases);