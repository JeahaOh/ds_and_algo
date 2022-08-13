// 음양 더하기
// const absolutes = [4, 7, 12],
//   signs = [true, false, true];
const absolutes = [1, 2, 3],
  signs = [false, false, true];

function solution(absolutes, signs) {
  return absolutes.reduce((acc, cur, idx) => {
    return (signs[idx]) ? acc += cur : acc -= cur;
  }, 0);
}

console.log(solution(absolutes, signs));

// Need to think about what is a 'good' code not just 'cool'.