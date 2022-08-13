// 약수의 합

const n = 12;
// const n = 5;

function solution(n) {
  return findDivisor(n).reduce((acc, cur) => acc += cur, 0);
}

function findDivisor(n) {
  var val = 1;
  var divisors = [];

  while (val <= n) {
    if (n % val === 0) divisors.push(val);
    val++;
  }
  return divisors;
}

console.log(solution(n));