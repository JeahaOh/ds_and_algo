class Node {
  constructor(data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}

class BST {
  constructor() {
    this.root = null;
  }

  insert(data) {
    if (this.root === null) {
      this.root = new Node(data);
      return;
    }

    this.currentNode = this.root;
    //console.log('current : ', this.currentNode);
    //console.log('root', this.root);

    while (this.currentNode) {
      //console.log('data : ', data, 'current.data : ', this.currentNode.data);
      if (data < this.currentNode.data) {
        if (this.currentNode.left !== null) {
          this.currentNode = this.currentNode.left;
        } else {
          this.currentNode.left = new Node(data);
          break;
        }
      } else {
        if (this.currentNode.right !== null) {
          this.currentNode = this.currentNode.right;
        } else {
          this.currentNode.right = new Node(data);
          break;
        }
      }
    }
  }
  
  search(data) {
    this.currentNode = this.root;

    while (this.currentNode) {
      if (this.currentNode.data == data) {
        return true;
      } else if (data < this.currentNode.data) {
        this.currentNode = this.currentNode.left;
      } else {
        this.currentNode = this.currentNode.right;
      }
    }

    return false;
  }
  
  remove(data) {
    // 제거할 data의 파라미터를 두번째 인자로 넣는다
    const removeNode = function (node, data) {
      if (node == null) {
        return null;
      }

      if (data == node.data) {
        // 말단 노드인 경우
        if (node.left == null && node.right == null) {
          return null;
        }

        if (node.left == null) {
          return node.right;
        }

        if (node.right == null) {
          return node.left;
        }

        let tempNode = node.right;
        while (tempNode.left !== null) {
          tempNode = tempNode.left;
        }

        node.data = tempNode.data;
        node.right = removeNode(node.right, tempNode.data);
        return node;
      } else if (data < node.data) {
        node.left = removeNode(node.right, data);
      } else {
        node.right = removeNode(node.root, data);
      }
    }
    this.root = removeNode(this.root, data);
  }

  print() {
    const printNode = function(node, parent) {
      if (node == null) {
        console.log('no data')
        return;
      }

      console.log(node);

      if (node.left != null)
    }
  }
}

bst = new BST();
bst.insert(10);
bst.insert(15);
bst.insert(5);
bst.insert(16);
bst.insert(6);
bst.insert(14);
bst.insert(4);

bst.search(15);


const getRandom = function(min, max) {
  return Math.ceil(Math.random() * (max - min) + min);
}

let bst_nums = new Set();

while (bst_nums.size != 100) {
  bst_nums.add(getRandom(0, 999));
}

console.log ('bst_nums : ', bst_nums);

const binary_tree = new BST();
bst.insert(500);

for (const num in bst_nums) {
  binary_tree.insert(num);
}

//for (const num in bst_nums) {}

const temp = Array.from(bst_nums);
const delete_nums = new Array();

for (const idx = 0; i < 10; i++) {
  delete_nums.add(temp[idx]);
}

for (const del_num in delete_nums) {

}



