const factorial = (num) => {
  if (num > 1) {
    return num * factorial(num - 1);
  } else {
    return num;
  }
}

for (let i = 0; i < 10; i++) {
  console.log(factorial(i));
}

console.log(`\n${'-'.repeat(10)}\n`);
/**
 * 재귀 호출의 일반적인 형태
 * 
 * const standard_recursive_1 = function(입력) {
 *   if 입력 > 일정값
 *     return standard_recursive_1(입력 - 1)
 *   else
 *     return 일정 값, 입력값 또는 특정 값
 * }
 * 
 * const standard_recursive_2 = function(입력) {
 *   if 입력 <= 일정값
 *     return 일정 값, 입력값 또는 특정 값
 *   
 *   return standard_recursive_2(입력갑 보다 작은 값)
 * }
 */

// 재귀함수를 활용, 1부터 num까지의 곱이 출력되게 만들기
const multiple = (num) => {
  if (num <= 1)
    return num;
  else return num * multiple(num - 1)
}

console.log(multiple(10));
console.log(`\n${'-'.repeat(10)}\n`);

// 숫자가 들어있는 리스트가 주어졌을 대, 리스트의 합을 리턴하는 함수 만들기
const sum_list = (list) => {
  if (list.length <= 1)
    return list[0];

  return list[0] + sum_list(list.splice(1));
}

const data_set = new Set();

for (let i = 0; i < 10; i++) {
  data_set.add(Math.floor(Math.random() * 100))
}

const data_list = Array.from(data_set);

console.log(data_list);
const sum = sum_list(data_list);
console.log(sum);
console.log(`\n${'-'.repeat(10)}\n`);

// 회문을 판별하는 함수를 재귀함수를 활용하여 만들어 봄
const checkIsPalindrome = (src) => {
  if (src.length <= 1) return true;

  if (src[0] == src.substring(src.length - 1, src.length))
    return checkIsPalindrome(src.substring(1, src.length - 1));
  else return false;
}

const palindrome = ['sator', 'arepo', 'tenet', 'opera', 'rotas'];
palindrome.forEach((src) => {
  console.log(`${src} isPalindrome : ${checkIsPalindrome(src)}`)
});
console.log(`\n${'-'.repeat(10)}\n`);

/**
 * 1, 정수 n에 대해
 * 2. n이 홀수이면 3 X n + 1 을 하고,
 * 3. n이 짝수이면 n 을 2로 나눕니다.
 * 4. 이렇게 계속 진행해서 n 이 결국 1이 될 때까지 2와 3의 과정을 반복합니다.
 * 이렇게 정수 n을 입력받아, 위 알고리즘에 의해 1이 되는 과정을 모두 출력하는 함수를 작성하세요.
 */
const makeOne = (n) => {
  console.log(`n : ${n}`);

  if (n == 1)
    return n;

  if (n % 2 == 1)
    return (makeOne((3 * n) + 1))
  else
    return (makeOne(n / 2))
}

makeOne(3);
console.log(`\n${'-'.repeat(10)}\n`);

/**
 * 정수 4를 1, 2, 3의 조합으로 나타내는 방법은 다음과 같이 총 7가지가 있음
 * 1 + 1 + 1 + 1
 * 1 + 1 + 2
 * 1 + 2 + 1
 * 1 + 3
 * 2 + 1 + 1
 * 2 + 2
 * 3 + 1
 * 
 * 정수 n이 입력으로 주어졌을 때, n을 1, 2, 3의 합으로 나타낼 수 있는 "방법의 수"를 구하시오
 * hint : 정수 n을 만들 수 있는 경우의 수를 리턴하는 함수를 f(n) 이라고 하면,
 * f(n)은 f(n-1) + f(n-2) + f(n-3)과 동일하다는 패턴 찾기
 */
const f = (n) => {
  switch (n) {
    case 1:
      return 1
    case 2:
      return 2
    case 3:
      return 4
    default:
      return f(n - 1) + f(n - 2) + f(n - 3);
  }
}

console.log(`${f(5)}`)