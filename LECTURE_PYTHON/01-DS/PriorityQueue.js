class QElement {
  constructor(data, priority) {
    this.data = data;
    this.priority = priority;
  }
}

class PriorityQueue {
  constructor() {
    this.queue = [];
  }

  enqueue(data, priority) {
    const qEle = new QElement(data, priority);
    let isContains = false;

    for (let i = 0, j = this.queue.length; i < j; i++) {
      if (this.queue[i].priority < qEle.priority) {
        this.queue.splice(i, 0, qEle);
        isContains = true;
        break;
      }
    }

    if (!isContains) {
      this.queue.push(qEle);
    }
  }

  dequeue() {
    if (this.isEmpty()) {
      return new Error('no data');
    }
    return this.queue.shift().data;
  }

  isEmpty() {
    return this.queue.length === 0;
  }

  getHead() {
    if (this.isEmpty()) {
      return new Error('no data');
    }
    return this.queue[0].data;
  }

  getTail() {
    if (this.isEmpty()) {
      return new Error('no data');
    }
    return this.queue[this.queue.length - 1].data;
  }

  print() {
    let str = '';
    this.queue.forEach(ele => str += ele.data + ' ');
    return str;
  }
}

q = new PriorityQueue();

q.isEmpty()

q.getTail()

q.getHead()

q.enqueue('a', 5);

q.isEmpty()

q.getTail()

q.getHead()

q.enqueue('b', 6);
q.enqueue('c', 4);
q.enqueue('C', 4);
q.enqueue('d', 7);
q.enqueue('D', 3);

q.dequeue();

q.print();