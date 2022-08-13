// 최대 공약수와 최소 공배수

const n = 3,
  m = 12;
// const n = 2, m = 5;

const solution = (n, m) => {
  var gcd = getGcd(n, m);
  var ldm = (n * m) / gcd;

  return [gcd, ldm];
}

const getGcd = (n, m) => {
  return (m === 0) ?
    n :
    n > m ? getGcd(m, n % m) : getGcd(n, m % n);
}

console.log(solution(n, m));