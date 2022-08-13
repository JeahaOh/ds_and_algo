// 제일 작은 수 제거하기

// const arr = [4, 3, 2, 1];
const arr = [10];

function solution(arr) {
  if (arr.length <= 1) {
    return [-1];
  }
  var min = Math.min(...arr);
  return arr.filter(e => e !== min);
}

console.log(solution(arr));