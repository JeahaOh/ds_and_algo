class Node {
  constructor(data, left = null, right = null) {
    this.data = data;
    this.left = left;
    this.right = right;
  }

  show() {
    return this.data;
  }
}

class BST {
  constructor() {
    this.root = null;
  }

  getRoot() {
    return this.root;
  }

  insert(data) {
    // 이미 있으면 넣지 않음
    if (this.find(data) != null) return;

    let n = new Node(data);
    if (this.root == null) {
      this.root = n;
      return;
    }

    let current = this.root;
    let parent;

    while (true) {
      parent = current;

      if (data < current.data) {
        current = current.left;

        if (current == null) {
          parent.left = n;
          break;
        }
      } else if (current.data < data) {
        current = current.right;

        if (current == null) {
          parent.right = n;
          break;
        }
      }
    }
  }

  // 중위 순회
  inOrder(node) {
    if (!(node == null)) {
      this.inOrder(node.left);
      console.log(node.show());
      this.inOrder(node.right);
    }
  }

  // 전위 순회
  preOrder(node) {
    if (!(node == null)) {
      console.log(node.show());
      this.preOrder(node.left);
      this.preOrder(node.right);
    }
  }

  // 후위 순회
  postOrder(node) {
    if (!(node == null)) {
      this.postOrder(node.left);
      this.postOrder(node.right);
      console.log(node.show());
    }
  }

  find(data) {
    if (data == null) {
      console.error('data is null');
      return null;
    }

    let current = this.root;
    if (current === null || current.data === null) {
      console.error('can not catch root');
      return null;
    }

    while (current.data != data) {
      if (data < current.data) {
        current = current.left
      } else if (current.data < data) {
        current = current.right;
      }

      if (current == null) {
        //console.error('can not find data : ', data);
        return null;
      }
    }

    return current;
  }

  remove(data) {
    this.root = this.removeNode(this.root, data);
  }

  removeNode(node, data) {
    if (node == null) {
      return null;
    }

    if (data == node.data) {
      if (node.left == null && node.right == null) {
        return null;
      }

      if (node.left == null) {
        return node.right;
      }

      if (node.right == null) {
        return node.left;
      }

      let tempNode = this.getSmallest(node.right);
      node.data = tempNode.data;
      node.right = this.removeNode(node.right, tempNode.data);
      return node;
    } else if (data < node.data) {
      node.left = this.removeNode(node.left, data);
      return node;
    } else {
      node.right = this.removeNode(node.right, data);
      return node;
    }
  }

  getSmallest(node) {
    let current = node;
    while (!(current.left == null)) {
      current = current.left;
    }

    return current;
  }
}


const bst = new BST();
const elements = [];

for (let i = 1; i <= 20; i++) {
  elements.push(Math.floor(Math.random() * 100));
}
console.log('elements : ', elements);

for (const idx in elements) {
  bst.insert(elements[idx]);
}
console.log(JSON.stringify(bst));

console.log('----- pre order -----');
console.log(bst.preOrder(bst.getRoot()));
console.log('----- in order -----');
console.log(bst.inOrder(bst.getRoot()));
console.log('----- post order -----');
console.log(bst.postOrder(bst.getRoot()));

console.log('\n----------------------------------\n');

let elementToFind = elements[Math.floor(Math.random() * elements.length)];
console.log(`\nfind : ${elementToFind}\n`, bst.find(elementToFind));

elementToFind = elements[Math.floor(Math.random() * elements.length)];
console.log(`\nfind : ${elementToFind}\n`, bst.find(elementToFind));

elementToFind = elements[Math.floor(Math.random() * elements.length)];
console.log(`\nfind : ${elementToFind}\n`, bst.find(elementToFind));

console.log('\n----------------------------------\n');

let elementToDelete = Math.floor(Math.random() * elements.length);
console.log(`\nelementToDelete : ${elementToDelete}\n`, bst.find(elementToDelete), bst.remove(elementToDelete));

elementToDelete = Math.floor(Math.random() * elements.length);
console.log(`\nelementToDelete : ${elementToDelete}\n`, bst.find(elementToDelete), bst.remove(elementToDelete));

console.log('\n----------------------------------\n');

console.log(JSON.stringify(bst));