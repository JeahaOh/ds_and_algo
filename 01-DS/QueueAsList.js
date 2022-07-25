let queue_list = [];

function enqueue(data) {
  queue_list.push(data);
}

function dequeue() {
  const data = queue_list[0];
  queue_list.shift();
  return data;
}

for (let i = 1; i <= 10; i++) {
  enqueue(i);
}

console.log('queue_list : ', queue_list);
console.log('queue_list.length', queue_list.length);
console.log('\n');

console.log(dequeue());
console.log('queue_list : ', queue_list);
console.log('queue_list.length', queue_list.length);
console.log('\n');

console.log(dequeue());
console.log('queue_list : ', queue_list);
console.log('queue_list.length', queue_list.length);
console.log('\n');

console.log(dequeue());
console.log('queue_list : ', queue_list);
console.log('queue_list.length', queue_list.length);