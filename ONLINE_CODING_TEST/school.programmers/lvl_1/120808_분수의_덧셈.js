// 두 수의 최대공약수 구하기
const GCD = (a, b) => (b === 0 ? a : GCD(b, a % b));

function solution(numer1, denom1, numer2, denom2) {
  // 두 분수를 통분
  let numer = numer1 * denom2 + numer2 * denom1;
  let denom = denom1 * denom2;

  // 분자와 분모의 최대공약수 구하기
  let gcd = GCD(numer, denom);

  // 각각 최대공약수로 나눠 약분, 기약분수로 만들기
  numer /= gcd;
  denom /= gcd;

  return [numer, denom];
}
