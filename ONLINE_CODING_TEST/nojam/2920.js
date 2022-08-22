// 백준 2920 음계
var notes = require('fs').readFileSync('/dev/stdin').toString().split(' ');
// var notes = [1, 2, 3, 4, 5, 6, 7, 8]
// var notes = [8, 7, 6, 5, 4, 3, 2, 1]
// var notes = [1, 3, 2, 4, 3, 5, 4, 6]
var isAsc = true;
var isDesc = true;

for (var i = 0; i < notes.length - 1; i++) {
  if (notes[i] > notes[i + 1]) {
    isAsc = false;
  } else if (notes[i] < notes[i + 1]) {
    isDesc = false;
  } else {
    isDesc = false;
    isAsc = false;
    break;
  }
}

if (isAsc) console.log('ascending');
else if (isDesc) console.log('descending')
else console.log('mixed')