// function solution(X, A) {
//   const set = new Set();
//   let time = null;

//   for (let i = 0; i < A.length; i++) {
//     set.add(A[i]);
//     //console.log(i, A[i], X, set.size, set)
//     if (set.size === X) {
//       time = i;
//       break;
//     }
//   }

//   //console.log('\ntime : ', time, time === null);
//   const max = Math.max(...set);
//   const sumMax = max * (max + 1) / 2;
//   const expectedMax = time * (time + 1) /2;

//   if (sumMax !== expectedMax) return -1;

//   return time === null ? -1 : time;
// }

// 
/**
 * [1, [4]]일 경우 해결되지 않음
 * total score 100%
 * O(n)
 */
// function solution(X, A) {
//   const set = new Set();
//   let time = null;

//   for (let i = 0; i < A.length; i++) {
//     set.add(A[i]);

//     if (set.size === X) {
//       return i;
//     }
//   }

//   return -1;
// }


function solution(X, A) {
  const times = new Map();

  for (let i = 0; i < A.length; i++) {
    let time = A[i];

    if (!times.has(time)) {
      times.set(time, true)
    }

    if (times.size === X) {
      return i;
    }
  }

  return -1;
}


const tests = [{
    A: [1, 3, 1, 4, 2, 4, 5, 4],
    X: 5
  },
  {
    A: [1],
    X: 1
  },
  {
    A: [4],
    X: 1
  },
  {
    A: [2],
    X: 4
  },
  {
    A: [1, 2],
    X: 2
  },

];

for (const test of tests) {
  console.log(test, '\n\t->\t', solution(test.X, test.A), '\n----\n');
}