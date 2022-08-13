// 콜라츠 추측
const nums = [6, 16, 626331];

const solution = (num) => {
  var count = 0;

  if (num === 1) {
    return 0;
  }

  while (true) {
    if (count >= 500) {
      return -1;
    } else if (num === 1) {
      return count;
    }

    if (num % 2 === 0) {
      // even
      num /= 2;
    } else {
      // odd
      num = (num * 3) + 1
    }

    count++
  }
}

for (idx in nums) {
  console.log(solution(nums[idx]));
}