// 소수 찾기
// '에라토스테네스의 체'를 이용한 풀이법
// 미쳤다 이런건..
const nums = [10, 5, 41, 1000, 10000];

function solution(n) {
  if (n === 2) return 1;

  var answer = 0;

  // true false를 저장하는 n + 1 길이의 Array
  const boolArr = new Array(n + 1).fill(true);
  // 제곱근 까지 제한함
  const limit = Math.sqrt(n);

  for (let i = 2; i <= limit; ++i) {

    // 이미 소수가 아닌 인덱스는 건너 뜀
    if (boolArr[i] === false) {
      continue;
    }

    // 소수가 아닌 데이터는 false
    for (let k = i * i; k <= n; k += i) {
      boolArr[k] = false;
    }
  }

  // 소수의 갯수, true의 갯수 세기
  for (let i = 2; i <= n; ++i) {
    if (boolArr[i] === true) {
      answer++;
    }
  }

  return answer;
}

for (let n in nums) {
  console.log(solution(nums[n]));
}