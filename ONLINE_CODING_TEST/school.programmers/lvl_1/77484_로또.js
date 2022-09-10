function solution(lottos, win_nums) {
  // 남아있는 번호 중 맞은 번호 수 구하기
  const correct = lottos.filter(num => win_nums.includes(num)).length;
  // 지워진 번호 수 구하기
  const zeros = lottos.filter(num => num === 0).length;

  // 맞은 번호 수가 최대 당첨 가능 등수
  let min = 7 - correct >= 6 ? 6 : 7 - correct;
  // 맞은 번호의 수 + 지워진 번호가 다 맞았을 경우
  let max = min - zeros < 1 ? 1 : min - zeros;

  return [max, min];
}