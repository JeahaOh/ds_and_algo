// 시저 암호

const strs = ['AB', 'z', 'a B z'];
const ns = [1, 1, 4];

// 제출 답안
function solution(s, n) {
  var answer = [];
  s = s.split('');
  var limit = s.length;

  for (var i = 0; i < limit; i++) {
    var charCode = s[i].charCodeAt();

    let isUpper = 65 <= charCode && charCode <= 90;
    let isLower = 97 <= charCode && charCode <= 122;

    // 영문 대소문자만 암호화 공백 혹은 특수문자일 경우 pass
    if (isLower || isUpper) {
      charCode += n;

      // z 혹은 Z가 넘어간다면 - 26
      if ((isLower && charCode > 122) || (isUpper && charCode > 90)) {
        charCode -= 26;
      }
    }

    answer.push(String.fromCharCode(charCode));
  }

  return answer.join('');
}

// map 사용한다면?
// function solution(s, n) {
//   return s.split('').map(c => {
//     let charCode = c.charCodeAt();
//     let isUpper = 65 <= charCode && charCode <= 90;
//     let isLower = 97 <= charCode && charCode <= 122;
//     if (isLower || isUpper) {
//       charCode += n;
//       if ((isLower && charCode > 122) || (isUpper && charCode > 90)) {
//         charCode -= 26;
//       }
//       return String.fromCharCode(charCode);
//     } else {
//       return c;
//     }
//   }).join('');
// }



strs.forEach((s, idx) => {
  console.log(solution(s, ns[idx]));
});

/**
 * 아스키 코드를 이용하여 해결, 결과 +7점
 */