const dartResultList = [
  '1S2D*3T',
  '1D2S#10S',
  '1D2S0T',
  '1S*2T*3S',
  '1D#2S*3S',
  '1T2D3D#',
  '1D2S3T*',
]

function solution(dartResult) {
  var answer = [];

  // 점수만 담은 배열
  var scores = dartResult.match(/(\d){1,2}(\w){0,1}(\*|#){0,1}/gi);
  console.log(`\n${'>'.repeat(10)} dartResult : ${dartResult}, scores : ${scores} ${'<'.repeat(10)}`);

  for (let i = 0; i <= 2; i++) {
    let result = scores[i];
    let score = result.match(/(\d){1,2}/)[0];
    let bonus = result.match(/(S|D|T)/)[0];
    let option = result.match(/(\*|#)/);
    option = option === null ? '' : option[0];

    console.log(`\nscore : ${score}, bonus : ${bonus}, option : ${option}`);


    switch (bonus) {
      case 'D':
        score = Math.pow(score, 2);
        break;
      case 'T':
        score = Math.pow(score, 3);
        break;
      default:
        // S는 냅둔다
    }

    switch (option) {
      case '*':
        if (i > 0) {
          answer[i - 1] = answer[i - 1] * 2
        }
        score *= 2;
        break;
      case '#':
        score *= (-1);
        break;
      default:
    }

    answer.push(score);
    console.log(`score : ${score}, bonus : ${bonus}, option : ${option}\n`);
  }

  console.log(answer);
  answer = answer.reduce((acc, cur) => acc += Number(cur), 0);
  return answer;
}

console.log(solution('1D2S#10S'));
for (var result of dartResultList) {
  console.log(solution(result));
}