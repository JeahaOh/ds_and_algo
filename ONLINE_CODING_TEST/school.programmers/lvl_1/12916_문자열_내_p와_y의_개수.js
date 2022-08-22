function solution(s) {
  return s.toLowerCase().split('y').length === s.toLowerCase().split('p').length;
}

const ss = ['pPoooyY', 'Pyy', 'yPpY', 'yPPy'];

for (let str of ss) {
  console.log(str, solution(str));
}