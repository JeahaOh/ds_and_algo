function solution(sizes) {
  let maxW = Number.MIN_SAFE_INTEGER;
  let maxH = Number.MIN_SAFE_INTEGER;
  // [w, h]
  for (let size of sizes) {
    if (size[0] < size[1]) {
      size[0] ^= size[1];
      size[1] ^= size[0];
      size[0] ^= size[1];
    }
    maxW = Math.max(maxW, size[0]);
    maxH = Math.max(maxH, size[1]);
  }
  return maxW * maxH;
}