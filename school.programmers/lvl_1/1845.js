// 포켓몬
// const nums = [3, 1, 2, 3];
const nums = [3, 3, 3, 2, 2, 4];
// const nums = [3, 3, 3, 2, 2, 2];

// function solution(nums) {
//   var answer = nums.length / 2;
//   var arr = nums.filter((e, i) => nums.indexOf(e) === i);
//   return answer < arr.length ? answer : arr.length;
// }
function solution(nums) {
  var answer = nums.length / 2;
  var set = new Set(nums);
  return answer < set.size ? answer : set.size;
}

console.log(solution(nums));

// 문제 설명을 이해하는게 더 중요한 듯.