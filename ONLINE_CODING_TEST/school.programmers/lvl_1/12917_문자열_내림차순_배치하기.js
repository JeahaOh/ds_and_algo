function solution(s) {
  //return s.split('').sort().reverse().join('');

  var answer = [];
  var capitals = [];

  s = s.split('');
  for (var i = 0; i < s.length; i++) {
    var c = s[i].charCodeAt();

    if (c <= 90) capitals.push(String.fromCharCode(c));
    else answer.push(String.fromCharCode(c));
  }

  answer = answer.sort().reverse().concat(capitals.sort().reverse()).join('');
  return answer
}

const ss = ['Zbcdefg'];

for (const str of ss) {
  console.log(str, solution(str));
}