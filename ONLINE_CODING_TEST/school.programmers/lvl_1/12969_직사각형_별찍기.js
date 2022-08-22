const solution = (data => {
  const input = data.split(" ");
  const N = Number(input[0]),
    M = Number(input[1]);
  console.log(('*'.repeat(N) + '\n').toString().repeat(M));
});

solution('5 3');