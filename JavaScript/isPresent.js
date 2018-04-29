isPresent(root, val) {
  while (root)
  {
    if (val === root.data)
      return true;
    else if (val < root.data)
      root = root.left;
    else if (val > root.data)
      root = root.right
  }

  return false;
}
