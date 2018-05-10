function reverseLinkedList(root) {
  let prev = null;
  let current = root;
  let next = root.next;

  while (current) {
    current.next = prev;
    prev = current;
    current = next;
    next = current != null ? current.next : null;
  }

  return prev;
}

class Node {
  constructor(val, next = null) {
    this.val = val;
    this.next = next;
  }
}

let n3 = new Node(3);
let n2 = new Node(2, n3);
let n1 = new Node(1, n2);

console.log(n1);
console.log(reverseLinkedList(n1));
