function solution(a, b) {
  // const dayOfTheWeek = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT'];
  // return dayOfTheWeek[new Date(2016, a - 1, b).getDay()];

  //return ((new Date(2016, a - 1, b).toString()).split(' ')[0].toUpperCase());

  const dayOfTheWeek = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT'];
  // 윤년 -> 2월은 29일
  const totDateOfMonths = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, ];
  // 1월 1일이 금요일이라면 5가 되여야 함
  let day = b + 4;

  for (let i = 0; i < a - 1; i++) {
    day += totDateOfMonths[i];
  }

  return dayOfTheWeek[day % 7];
}

const params = [{
  a: 5,
  b: 24
}, {
  a: 4,
  b: 27
}, {
  a: 12,
  b: 25
}];

for (const param of params) {
  console.log(solution(param.a, param.b));
}