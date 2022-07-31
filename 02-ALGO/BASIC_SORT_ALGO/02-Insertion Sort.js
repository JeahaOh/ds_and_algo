const insertion_sort = (arr) => {
  for (let i = 1; i < arr.length; i++) {
    let curr = arr[i];
    console.log(`i : ${i} ::\t${arr}\n\t curr -> ${curr}`);
    let prv = i - 1;

    while (prv >= 0 && arr[prv] > curr) {
      arr[prv + 1] = arr[prv];
      console.log(`\t${arr[prv]} -> \t${arr}`);
      prv--;
    }
    arr[prv + 1] = curr;
    console.log();
  }

  return arr
}

const data_set = new Set();

for (let i = 0; i < 10; i++) {
  data_set.add(Math.floor(Math.random() * 100))
}

const data_list = Array.from(data_set);

console.log(data_list);
insertion_sort(data_list);
console.log(data_list);