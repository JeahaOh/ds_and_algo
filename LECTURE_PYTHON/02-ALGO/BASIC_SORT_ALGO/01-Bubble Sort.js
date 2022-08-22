const bubblesort = (data) => {
  for (let index = 0; index < data.length; index++) {

    let swap = false;

    for (let idx = 0; idx < data.length - index - 1; idx++) {
      if (data[idx] > data[idx + 1]) {
        data[idx] ^= data[idx + 1];
        data[idx + 1] ^= data[idx];
        data[idx] ^= data[idx + 1];
        swap = true;
      }
    }

    if (!swap) {
      break;
    }
  }

  return data
}


const data_set = new Set();

for (let i = 0; i < 50; i++) {
  data_set.add(Math.floor(Math.random() * 100))
}

const data_list = Array.from(data_set);

console.log(data_list);
bubblesort(data_list);
console.log(data_list);