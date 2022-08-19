/**
 * 13 분 만에 작성한 답, 문제 해석이 오래 걸림.
 * 배열의 최대 길이가 100,000 이면 효율이 떨어질 것 같아서 체점 없이 다시 코드 짬.
 * 체점 결과
 * total 53%
 * Task Score 53%, Correctness 100%, Performance 0%
 * O(N * N)
 */
// function solution(A) {
//   const limit = A.length;
//   const differ = [];
//   for (let i = 1; i < limit; i++) {
//     const head = A.slice(0, i).reduce((acc, cur) => acc += cur, 0);
//     const tail = A.slice(i, limit).reduce((acc, cur) => acc += cur, 0);
//     differ.push(Math.abs(head - tail));
//   }
//   return Math.min(...differ);
// }

/**
 * 37분만에 나온 수정 답안, google 참고함
 * 반복을 두번 돌림.
 * total 84%
 * Task Score 84%, Correctness 71%, Performance 100%
 * O(n)
 * -> total reduce에 0을 넣어서 예외가 발생함.
 */
// function solution(A) {
//   let answer = Number.MAX_SAFE_INTEGER;
//   const accArr = [];
//   const total = A.reduce((acc, cur) => {
//     accArr.push(acc);
//     return acc + cur;
//   }, 0);


//   console.log('total : ', total, ', accArr : ', accArr, ', A :', A);
//   for (const val of accArr) {
//     const differ = (total - val)
//     answer = Math.min(answer, Math.abs(val - differ));
//   }

//   return answer;
// }

/**
 * total 100%
 */
function solution(A) {
  let answer = Number.MAX_SAFE_INTEGER;
  const accArr = [];
  const total = A.reduce((acc, cur) => {
    accArr.push(acc);
    return acc + cur;
  });


  console.log('total : ', total, ', accArr : ', accArr, ', A :', A);
  for (const val of accArr) {
    const differ = (total - val)
    answer = Math.min(answer, Math.abs(val - differ));
  }

  return answer;
}


const tests = [
  [3, 1, 2, 4, 3, ],
  [2000, 2000]
];

for (const test of tests) {
  console.log(test, '\n\t->\t', solution(test));
}