/**
 * Total Score 100%
 * Task Score, Correctness, Perfomance 100%
 * O(1)
 * 간단한 수학 문제, pregrammers에 비슷한 문제를 풀었음..
 * @param {*} X 시작 위치
 * @param {*} Y 목적지
 * @param {*} D 한번에 이동 가능한 거리
 * @returns 
 */
function solution(X, Y, D) {
  return Math.ceil((Y - X) / D);
}

const tests = [{
    X: 10,
    Y: 85,
    D: 30
  },
  {
    X: 0,
    Y: 0,
    D: 0
  },
];

for (const test of tests) {
  console.log(test, '\n\t->\t', solution(test.X, test.Y, test.D));
}