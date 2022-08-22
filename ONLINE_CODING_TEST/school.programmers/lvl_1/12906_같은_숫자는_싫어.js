function solution(arr) {
  return arr.reduce((p, c) => {
    if (p.length == 0 || (p.length > 0 && p[p.length - 1] !== c)) {
      p.push(c);
    }
    return p;
  }, [])
}

const arrArr = [
  [1, 1, 3, 3, 0, 1, 1],
  [4, 4, 4, 3, 3]
];

for (const arr of arrArr) {
  console.log(arr, solution(arr));
}