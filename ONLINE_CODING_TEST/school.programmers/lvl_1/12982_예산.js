function solution(d, budget) {
  var answer = 0;
  var total = 0;

  // 오름차순 정렬
  d.sort((a, b) => a - b);

  // 예산이 넘지 않을 때까지 더하기
  for (var i = 0; total + d[i] <= budget; i++) {
    total += d[i];
    answer++;
  }

  return answer;
}

const params = [{
    d: [1, 3, 2, 5, 4],
    budget: 9
  },
  {
    d: [2, 2, 2, 3, 3],
    budget: 10
  }
];

for (const param of params) {
  console.log(param, ' -> ', solution(param.d, param.budget));
}