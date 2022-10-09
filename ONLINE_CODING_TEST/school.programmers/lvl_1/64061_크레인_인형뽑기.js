function solution(board, moves) {
  let answer = 0;
  let stack = [];

  for (let move of moves) {
    for (let i = 0; i < board.length; i++) {
      if (board[i][move - 1] != 0) {
        let temp = board[i][move - 1];
        board[i][move - 1] = 0;

        if (stack.length > 0 && temp == stack[stack.length - 1]) {
          answer += 2;
          stack.pop();
        } else {
          stack.push(temp);
        }

        break;
      }
    }
  }

  return answer;
}

const board = [
  [0, 0, 0, 0, 0],
  [0, 0, 1, 0, 3],
  [0, 2, 5, 0, 1],
  [4, 2, 4, 4, 2],
  [3, 5, 1, 3, 1]
];
const moves = [1, 5, 3, 5, 1, 2, 1, 4];

console.log('-'.repeat(100));
console.time();
console.log('\n\t->\t', solution(board, moves));
console.timeEnd();
console.timeLog();
console.log('-'.repeat(100) + '\n');