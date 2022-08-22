function solution(n) {
  for (let i = 1; i <= n; i++) {
    if (n % i === 1) return i;
  }
}

const ns = [10, 12];

for (const n of ns) {
  console.log(n, solution(n));
}