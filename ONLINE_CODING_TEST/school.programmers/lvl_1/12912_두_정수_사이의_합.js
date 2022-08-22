function solution(a, b) {
  var answer = 0;
  if (a > b) {
    a ^= b;
    b ^= a;
    a ^= b;
  }
  for (a; a <= b; a++) {
    answer += a;
  }
  return answer;
}

const arr = [{
  a: 3,
  b: 5
}, {
  a: 3,
  b: 3
}, {
  a: 5,
  b: 3
}];

for (let obj of arr) {
  console.log(obj, solution(obj.a, obj.b));
}