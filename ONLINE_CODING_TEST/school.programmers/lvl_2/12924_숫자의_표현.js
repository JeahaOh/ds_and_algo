function solution(n) {
  let answer = 0,
    cnt = 0;

  while (n > 0) {
    cnt++;
    if (n % cnt === 0) answer++;
    n -= cnt;
  }

  return answer;
}