class Queue {

  constructor() {
    this._storage = {};
    this.head = 0;
    this.tail = 0;
  }

  // 크기 구하기
  size() {
    // rear가 없다면 데이터가 없다는 것임
    if (this._storage[this.head] === undefined) {
      return 0;
    } else {
      return this.tail - this.head + 1
    }
  }

  enqueue(value) {
    //console.log(this.size());
    // queue에 데이터가 없는 경우
    if (this.size() === 0) {
      this._storage[0] = value;
    } else {
      this._storage[++this.tail] = value;
    }
  }

  dequeue() {
    let temp;

    if (this.head == this.tail) {
      if (this._storage[this.head] == undefined) {
        return null;
      }

      temp = this._storage[this.head];
      delete this._storage[this.head];

      this.head = 0;
      this.tail = 0;
    } else {
      temp = this._storage[this.head];
      delete this._storage[this.head];

      this.head += 1;
    }
    return temp;
  }

  print() {
    return Object.keys(this._storage).reduce((prev, idx) => {
      return prev += this._storage[idx] + ' ';
    }, '');
  }

}

q = new Queue();

console.log('dequeue : ', q.dequeue()); // null

q.enqueue('A');
q.enqueue('B');
q.enqueue('C');
q.enqueue('D');
console.log('print : ', q.print()); // A B C D

console.log('dequeue : ', q.dequeue()); // A
console.log('dequeue : ', q.dequeue()); // B
console.log('print : ', q.print()); // C D
q.enqueue('E');
console.log('print : ', q.print()); // C D E

console.log(q._storage);
// {2: 'C', 3: 'D', 4: 'E'}