// 짝수와 홀수
const nums = [3, 4];

const solution = (num) => (num % 2 === 0) ? 'Even' : 'Odd';

for (i in nums) {
  console.log(solution(nums[i]))
}