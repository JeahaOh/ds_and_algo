function solution(n) {
  let answer = 0;
  let fibo1 = 0,
    fibo2 = 1;

  for (let i = 2; i <= n; i++) {
    answer = (fibo1 + fibo2) % 1234567;
    fibo1 = fibo2;
    fibo2 = answer;
  }

  return answer;
}