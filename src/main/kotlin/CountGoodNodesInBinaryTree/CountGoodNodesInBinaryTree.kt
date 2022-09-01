package CountGoodNodesInBinaryTree


class Solution {

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun runTest(){
        goodNodes(TreeNode(3).apply {
            left = TreeNode(1).apply {
                left = TreeNode(3)
            }
            right = TreeNode(4).apply {
                left = TreeNode(1)
                right = TreeNode(5)
            }
        })
    }

    fun goodNodes(root: TreeNode?): Int {
        if(root == null) return 0
        return dfs(root, root.`val`)
    }

    fun dfs(currNode: TreeNode?, maxValue: Int): Int{
        if(currNode == null) return 0
        val max = Math.max(maxValue, currNode.`val`)
        val left = dfs(currNode.left, max)
        val right = dfs(currNode.right, max)
        var res = left + right
        if(currNode.`val` >= max) res++
        return res
    }
}