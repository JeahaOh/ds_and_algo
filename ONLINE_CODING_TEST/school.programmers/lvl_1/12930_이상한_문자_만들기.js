// 이상한 문자 만들기
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


/**
 * 타인의 풀이
 * 문자열은 역시 정규표헌식을 이용하는게 성능적으로 유리한 것 같다
 */
// function solution(s) {
//   return s.replace(/\w\w/gi, (c) => c[0].toUpperCase() + c[1].toLowerCase());
// }

console.log(solution(s));