// var s = 'try hello world';
var s = 'LLHLLL lHlL'

function solution(s) {
  var answer = s.split(' ');
  for (var i in answer) {
    var temp = '';
    for (var j in answer[i]) {
      temp += ((j % 2) === 0) ? answer[i][j].toUpperCase() : answer[i][j].toLowerCase()
    }
    answer[i] = temp;
  }
  return answer.join(' ');
}

console.log(solution(s));