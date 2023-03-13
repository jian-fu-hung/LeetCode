package SymmetricTree

class Solution {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun isSymmetric(root: TreeNode?): Boolean {
        return tree(root?.left, root?.right)
    }

    fun tree(leftTree: TreeNode?, rightTree: TreeNode?): Boolean {
        if (leftTree == null && rightTree == null) {
            return true
        }
        if (leftTree == null || rightTree == null) {
            return false
        }
        return leftTree.`val` == rightTree.`val` && tree(leftTree.left, rightTree.right) && tree(leftTree.right, rightTree.left)
    }

}