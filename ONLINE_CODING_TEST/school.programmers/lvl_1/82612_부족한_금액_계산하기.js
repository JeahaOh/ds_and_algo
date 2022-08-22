// function solution(price, money, count) {
//   let totPrice = 0;

//   for (let i = 1; i <= count; i++) {
//     totPrice += (price * i);
//   }

//   totPrice = totPrice > money ? totPrice - money : 0;

//   return totPrice;
// }

// function solution(price, money, count) {
//   const totPrice = price * count * (count + 1) / 2 - money;
//   return totPrice > 0 ? totPrice : 0;
// }

function solution(price, money, count) {
  const totPrice = Array.from({
      length: count
    })
    .reduce((acc, cur, idx) => (acc += (idx + 1) * price), 0)
  return totPrice > money ? totPrice - money : 0;
}

console.log(solution(3, 20, 4));