function solution(s) {
  return /^\d{4}$|^\d{6}$/.test(s);
}

const ss = [
  'a234', '1234', '123456', 'as3325'
]

for (let str of ss) {
  console.log(str, solution(str));
}