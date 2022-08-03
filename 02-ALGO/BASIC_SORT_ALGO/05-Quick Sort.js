const quickSort = (arr) => {
  if (arr.length < 2) {
    return arr;
  }

  const pivot = [arr[0]];
  const left = [];
  const right = [];

  for (let i = 1; i < arr.length; i++) {
    if (arr[i] < pivot) {
      left.push(arr[i]);
    } else if (arr[i] > pivot) {
      right.push(arr[i]);
    } else {
      pivot.push(arr[i]);
    }
  }

  console.log(`left : ${left}, pivot : ${pivot}, right : ${right}`);

  return quickSort(left).concat(pivot, quickSort(right));
}

let sorted = quickSort([5, 3, 7, 1, 9]);
console.table(sorted);

const inplaceQuickSort = (arr, left = 0, right = arr.length - 1) => {
  if (left >= right) {
    return;
  }

  const mid = Math.floor((left + right) / 2);
  const pivot = arr[mid];
  const partition = divide(arr, left, right, pivot);

  inplaceQuickSort(arr, left, partition - 1);
  inplaceQuickSort(arr, partition, right);

  const divide = (arr, left, right, pivot) => {
    console.log(`arr : ${arr}, left : ${arr[left]}, pivot : ${pivot}, right : ${arr[right]}`);

    while (left <= right) {
      while (arr[left] < pivot) {
        left++;
      }
      while (arr[right] > pivot) {
        right++;
      }

      if (left <= right) {
        arr[left] ^= arr[right];
        arr[right] ^= arr[left];
        arr[left] ^= arr[right];
        left--;
        right--;
      }
    }
    return left;
  }

  return arr;
}

sorted = quickSort([5, 3, 7, 1, 9]);
console.table(sorted);