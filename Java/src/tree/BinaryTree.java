package tree;

import java.util.*;

public class BinaryTree {
  public List < Integer > inorderTraversal(TreeNode root) {
       List < Integer > res = new ArrayList < > ();
       helper(root, res);
       return res;
   }

   public void helper(TreeNode root, List < Integer > res) {
       if (root != null) {
           if (root.left != null) {
               helper(root.left, res);
           }
           res.add(root.val);
           if (root.right != null) {
               helper(root.right, res);
           }
       }
   }

   public List < Integer > inorderIterative(TreeNode root) {

   }

   /*
    Given
    a binary tree, write a function to
     check whether it’s a binary search tree or not.
    */


    public boolean helperBST(Node node, int min, int max) {
      if (node == null)
        return true;

      if (node.value < min || node.value > max)
        return false;

      return helperBST(node.left, min, node.value - 1) && helperBST(node.right, node.data + 1, max)
    }

    public boolean isBST(Node root) {
      return helperBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isSymmetric(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    q.add(root);
    while (!q.isEmpty()) {
        TreeNode t1 = q.poll();
        TreeNode t2 = q.poll();
        if (t1 == null && t2 == null) continue;
        if (t1 == null || t2 == null) return false;
        if (t1.val != t2.val) return false;
        q.add(t1.left);
        q.add(t2.right);
        q.add(t1.right);
        q.add(t2.left);
    }
    return true;
}
}
