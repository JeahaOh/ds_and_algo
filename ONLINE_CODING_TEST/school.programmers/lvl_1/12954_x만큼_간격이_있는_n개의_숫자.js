// x만큼 간격이 있는 n개의 숫자
function solution(x, n) {
  var answer = [];
  var tmp;

  for (var i = 0; i < n; i++) {
    tmp = x * (i + 1);
    answer.push(tmp)
  }
  return answer;
}

console.log(solution(2, 5));
console.log(solution(4, 3));
console.log(solution(-4, 2));