// function recursive(num) {
//   if (num < 0) {
//     console.log('ended');
//   } else {
//     console.log(num);
//     recursive(num - 1);
//     console.log('returnnd : ', num);
//   }
// }

// recursive(9);

stack_list = [];

const push = function (data) {
  stack_list.push(data);
}

const pop = function () {
  const data = stack_list.pop();
  return data;
}

for (let i = 1; i <= 10; i++) {
  push(i);
}


console.log(pop());


console.log('stack_list : ', stack_list);
console.log('stack_list.length', stack_list.length);
console.log('\n');

console.log(pop());
console.log('stack_list : ', stack_list);
console.log('stack_list.length', stack_list.length);
console.log('\n');

console.log(pop());
console.log('stack_list : ', stack_list);
console.log('stack_list.length', stack_list.length);
console.log('\n');

console.log(pop());
console.log('stack_list : ', stack_list);
console.log('stack_list.length', stack_list.length);