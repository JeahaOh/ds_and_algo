function solution(s) {
  let arr = [];
  for (let ele of s.split(" ")) {
    arr.push(Number(ele));
  }
  const max = Math.max(...arr);
  const min = Math.min(...arr);
  return `${min} ${max}`
}