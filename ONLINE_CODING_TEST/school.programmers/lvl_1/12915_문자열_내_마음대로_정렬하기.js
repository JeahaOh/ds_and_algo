function solution(strings, n) {
  return strings.sort(function (a, b) {
    // 비교할 n 번째 문자
    var prev = a[n];
    var next = b[n];

    if (prev === next) {
      // n번째가 같다면? 문자열 전체 비교
      return (a > b) - (a < b);
    } else {
      // 다르다면, prev, next를 비교
      return (prev > next) - (prev < next);
    }
  });
}

// function solution(strings, n) {
//   var answer = [];

//   // strings의 각 요소의 0번째를 n번째에 붙여서 대치
//   for (var i = 0; i < strings.length; i++) {
//     var chu = strings[i][n];
//     strings[i] = chu + strings[i];
//   }

//   strings.sort();
//   // 0번째 문자 제거
//   for (var j = 0; j < strings.length; j++) {
//     strings[j] = strings[j].replace(strings[j][0], "");
//     answer.push(strings[j])
//   }

//   return answer;
// }

const arr = [
  ['sun', 'bed', 'car'],
  ['abce', 'abcd', 'cdx']
];

for (let str of arr) {
  console.log(str, solution(str));
}