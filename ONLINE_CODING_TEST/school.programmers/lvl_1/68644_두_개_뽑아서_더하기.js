function solution(numbers) {
  var answer = new Set();

  for (let i = 0; i < numbers.length; i++) {
    for (let j = i + 1; j < numbers.length; j++) {
      answer.add(numbers[i] + numbers[j]);
    }
  }

  answer = Array.from(answer).sort((a, b) => a - b);
  return answer;
}


const ex = [
  [2, 1, 3, 4, 1],
  [5, 0, 2, 7]
];

for (const arr of ex) {
  console.log(arr, solution(arr));
}