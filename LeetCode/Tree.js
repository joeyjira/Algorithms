function Tree();

Tree.prototype.findLargestEachRow = function(node, level, result) {
  if (node.children.length === 0) return;

  let result = result;
  let children = node.children
  let values = children.map(child => child.value);
  let max = Math.max(...children);

  result[level] = max;
  for (let child of children) {
    findLargestEachRow(child, level + 1, result);
  }
}
