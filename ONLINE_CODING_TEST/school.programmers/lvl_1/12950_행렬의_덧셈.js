//행렬의 덧셈
const arr1 = [
    [1, 2],
    [2, 3]
  ],
  arr2 = [
    [3, 4],
    [5, 6]
  ];
const arr3 = [
    [1],
    [2]
  ],
  arr4 = [
    [3],
    [4]
  ];

function solution(arr1, arr2) {
  var answer = [
    []
  ];
  for (var i in arr1) {
    for (var j in arr1[i]) {
      if (answer[i] === undefined) {
        answer.push([])
      }
      answer[i][j] = (arr1[i][j] + arr2[i][j])
    }
  }
  return answer;
}

function solution2(arr1, arr2) {
  return arr1.map((a, i) => a.map((b, j) => b + arr2[i][j]));
}



console.log(solution(arr1, arr2));
console.log(solution2(arr1, arr2));