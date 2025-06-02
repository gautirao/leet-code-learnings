package com.goutham.datastructures.trees;

/*
* Problem Overview
Given a Binary Search Tree (BST) and a target integer value, the task is to return the value in the BST that is closest to the target. There is always exactly one closest value.

Each BST TreeNode has an integer value, a left child, and a right child.

The BST property: For each TreeNode, all values in the left subtree are less than the TreeNode's value, and all values in the right subtree are greater than or equal to the TreeNode's value.

Sample Input
The sample tree is:

text
      10
     /  \
    5    15
   / \   / \
  2   5 13 22
 /       \
1         14
Target: 12

Sample Output
Closest value: 13
*
* */
public class ClosestValue {

  public static int findClosestValueInBst(TreeNode tree, int target) {
    return findClosestValueInBst(tree, target, tree.val);
  }

  /*
      If current TreeNode is null, return closest.
  If abs(target - closest) > abs(target - current.value), update closest.
  If target < current.value, go left.
  If target > current.value, go right.
  Else, return closest.
      * */
  private static int findClosestValueInBst(TreeNode tree, int target, int closest) {
    if (Math.abs(target - closest) > Math.abs(target - tree.val)) {
      closest = tree.val;
    }
    if (target < tree.val && tree.left != null) {
      return findClosestValueInBst(tree.left, target, closest);
    } else if (target > tree.val && tree.right != null) {
      return findClosestValueInBst(tree.right, target, closest);

    } else {
      return closest;
    }
  }
}
