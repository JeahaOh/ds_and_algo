class Stack {
  constructor() {
    this._storage = {};
    this.index = 0;
  }

  size() {
    return this.index;
  }

  push(data) {
    this._storage[this.index++] = data;
  }

  pop() {
    if (this.size() < 0) {
      return null;
    }

    return this._storage[this.index--];
  }

  print() {
    return Object.keys(this._storage).reduce((prev, idx) => {
      return prev += this._storage[idx] + ' ';
    }, '');
  }
}

let stack = new Stack();

stack.push(1);
stack.push(2);
stack.push(3);
stack.push(4);
stack.push(5);
console.log('print : ', stack.print());

console.log(stack.pop());
console.log(stack.pop());
console.log(stack.pop());
console.log(stack.pop());
console.log(stack.pop());
console.log(stack.pop());
console.log(stack.pop());
console.log(stack.pop());
console.log(stack.pop());