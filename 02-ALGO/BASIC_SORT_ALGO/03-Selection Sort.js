const selectionSort = (arr) => {
  for (let i = 0; i < arr.length; i++) {
    let minIdx = i;
    console.log(`${i} 차`);

    for (let j = i + 1; j < arr.length; j++) {
      console.log(`\tlowest : ${arr[minIdx]}, next : ${arr[j]}`);
      if (arr[minIdx] > arr[j]) {
        minIdx = j;
      }
    }

    if (minIdx !== i) {
      arr[minIdx] ^= arr[i];
      arr[i] ^= arr[minIdx];
      arr[minIdx] ^= arr[i];
    }

    console.log(`->\t${arr}\n`);
  }

  return arr
}


const data_set = new Set();

for (let i = 0; i < 10; i++) {
  data_set.add(Math.floor(Math.random() * 100))
}

const data_list = Array.from(data_set);

console.log(data_list);
selectionSort(data_list);
console.log(data_list);