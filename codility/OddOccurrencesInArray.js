/**
 * 55%의 총점으로
 * 55% task score, 80% correctness, 25% Perfomance
 * O(N**2)의 효율로 끝남
 * n = 201 small random에서 runtime error
 * medium random, big random에서 timeout error
 * 
function solution(A) {
  const length = A.length;
  const boolArr = new Array(length).fill(false);
  console.log(boolArr)
  const compareMap = {};

  for (let i = 0; i < length; i++) {
    if (boolArr[i] === true) continue;
    const compareFrom = A[i];

    if (compareMap[compareFrom] === undefined) {
      compareMap[compareFrom] = 0;
    }

    for (let j = i + 1; j <= length - 1; j++) {
      if (boolArr[j] === true) continue;
      const compareTo = A[j];
      console.log(`i : ${i} -> ${compareFrom}, j : ${j} -> ${compareTo}`);

      if (compareFrom == compareTo) {
        boolArr[i] = true, boolArr[j] = true;
        compareMap[compareFrom] = compareMap[compareFrom] + 2;
        console.log(compareMap, boolArr);
        break;
      }
    }
    if (compareMap[compareFrom] === 0) {
      return compareFrom;
    }
    console.log();
  }

  console.log(compareMap, boolArr);

  const keys = Object.keys(compareMap);
  for (let i = 0; i < keys.length; i++) {
    const key = keys[i];
    if (compareMap[key] < 2) return key;
  }
}
*/

/**
 * total score 100%
 * task score, correctness, performance 100%
 * O(N) or O(N*log(N))
 */
function solution2(A) {
  // 등장하는 숫자를 저장.
  const map = {}

  for (let i = 0; i <= A.length - 1; i++) {
    const target = A[i]
    if (map[target]) {
      // 해당 숫자가 존재한다면 해당 키 제거
      delete map[target]
    } else {
      // 해당 숫자가 존재하지 않는다면 map에 추가
      map[target] = true
    }
  }

  // 리턴한다.
  return +Object.keys(map)[0]
}

/**
 * total score 100%
 * task score, correctness, performance 100%
 * O(N) or O(N*log(N))
 */
function solution2(A) {
  // reduce 함수로 횟수를 가지고 있는 객체 생성
  const totalCounter = A.reduce((counter, num) => {
    counter[num] = counter[num] ? counter[num] + 1 : 1;
    return counter;
  }, {});

  for (key in totalCounter) {
    // 값이 홀수인 key return
    if (totalCounter[key] % 2 === 1) {
      return Number(key);
    }
  }
}


const tests = [
  [9, 3, 9, 3, 9, 7, 9]
];

for (const test of tests) {
  console.log(test, '\n\t->\t', solution(test));
}