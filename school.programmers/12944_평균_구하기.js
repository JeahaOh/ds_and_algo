// 평균 구하기

const arr = [1, 2, 3, 4];
// const arr = [5, 5];

const solution = (arr) => {
  return arr.reduce((acc, cur) => acc += cur, 0) / arr.length;
}

console.log(solution(arr));