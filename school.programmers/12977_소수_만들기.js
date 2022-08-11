// 소수 만들기

// const nums = [1, 2, 3, 4];
const nums = [1, 2, 7, 6, 4];

function solution(nums) {
  var answer = [];

  for (var i = 0; i < nums.length - 2; i++) {
    for (var j = i + 1; j < nums.length - 1; j++) {
      for (var k = j + 1; k < nums.length; k++) {
        answer.push(nums[i] + nums[j] + nums[k]);
      }
    }
  }
  return answer.filter(i => isPrime(i)).length;
}

// 소수 판별
function isPrime(n) {
  // 제곱근을 구함
  var sqrt = Math.ceil(Math.sqrt(n));
  // 1은 소수가 아니기 때문에 판별에 불필요,
  // 제곱근까지만 반복 돌리면 소수 판단 가능함
  for (var l = 2; l <= sqrt; l++) {
    if (n % l === 0) return false;
  }
  return true;
}

console.log(solution(nums));