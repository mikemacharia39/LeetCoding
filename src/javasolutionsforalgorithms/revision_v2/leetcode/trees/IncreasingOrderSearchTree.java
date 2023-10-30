package javasolutionsforalgorithms.revision_v2.leetcode.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now
 * the root of the tree, and every node has no left child and only one right child.
 *
 * Example 1:
 * Input: root = [5,1,7]
 * Output: [1,null,5,null,7]
 *
 *      5                        1
 *    /   \           =>           \
 *   1     7                        5
 *                                    \
 *                                     7
 */
public class IncreasingOrderSearchTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {this.val = val;}
    }

    public TreeNode increasingBST(TreeNode root) {
        TreeNode ansRoot = new TreeNode(0);
        TreeNode ans = ansRoot;

        List<Integer> list = new ArrayList<>();
        inorder(root, list);

        for (int val : list) {
            ans.right = new TreeNode(val);
            ans = ans.right;
        }

        return ansRoot.right;
    }

    /**
     * Inorder traversal of a BST gives a sorted list
     * LEFT -> ROOT -> RIGHT
     * Time = O(N)
     * @param root
     * @param list
     */
    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
