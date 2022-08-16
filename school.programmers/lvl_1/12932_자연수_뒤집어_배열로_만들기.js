// 자연수 뒤집어 배열로 만들기

const n = 12345;


function solution(n) {
  var answer = [];
  n = String(n)
  for (var i = n.length - 1; i >= 0; i--) {
    answer.push(Number(n[i]));
  }
  return answer;
}

console.log(solution(n));