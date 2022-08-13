// 핸드폰 번호 가리기

// const phone_number = '01033334444';
const phone_number = '027778888';


function solution(phone_number) {
  return phone_number.split('').map((n, i) => {
    return i < phone_number.length - 4 ? '*' : n
  }).join('');
}

console.log(solution(phone_number));