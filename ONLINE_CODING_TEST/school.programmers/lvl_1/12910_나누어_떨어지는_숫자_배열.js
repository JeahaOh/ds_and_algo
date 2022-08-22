function solution(arr, divisor) {
  var answer = [];

  answer = arr.filter(ele => ele % divisor === 0).sort((a, b) => a - b);

  // var limit = arr.length;
  // for (var i = 0; i <= limit; i ++) {
  //     if (arr[i] % divisor === 0) answer.push(arr[i]);
  // }

  return answer.length >= 1 ? answer : [-1];
}

const arrArr = [{
    arr: [5, 9, 7, 10],
    divisor: 5
  },
  {
    arr: [2, 36, 1, 3],
    divisor: 1
  },
  {
    arr: [3, 2, 6],
    divisor: 10
  }
];

for (let obj of arrArr) {
  console.log(obj, solution(obj.arr, obj.divisor));
}