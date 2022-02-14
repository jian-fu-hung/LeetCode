package MaximumDepthofBinaryTree

class Solution {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun maxDepth(root: TreeNode?): Int {
        var output = 0

        if(root == null){
            return output
        }

        return countTree(root, output)
    }

    fun countTree( nowNode: TreeNode, count: Int): Int{
        val nowCount = count + 1
        var leftCount = 0
        var rightCount = 0
        if(nowNode.left == null && nowNode.right == null){
            return nowCount
        }
        if(nowNode.left != null){
            leftCount = countTree(nowNode.left!!, nowCount)
        }
        if(nowNode.right != null){
            rightCount = countTree(nowNode.right!!, nowCount)
        }
        return Math.max(rightCount, leftCount)
    }
}