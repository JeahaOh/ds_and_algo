// 하샤드 수

const arr = [10, 12, 11, 13];

const solution = (x) => {
  const digit = String(x).split('').reduce((acc, cur) => acc += Number(cur), 0);
  return x % digit === 0;
}

arr.forEach(val => {
  console.log(solution(val));
});