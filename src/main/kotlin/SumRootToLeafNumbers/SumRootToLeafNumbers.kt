package SumRootToLeafNumbers

class Solution {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun runTest() {
        println(
            sumNumbers(
                TreeNode(1).apply {
                    left = TreeNode(2)
                    right = TreeNode(3)
                })
        )

        println(sumNumbers(
            TreeNode(4).apply {
                left = TreeNode(9).apply {
                    left = TreeNode(5)
                    right = TreeNode(1)
                }
                right = TreeNode(0)
            }
        ))
    }

    var answer = 0

    fun sumNumbers(root: TreeNode?): Int {
        if (root == null) return 0
        if (root.left == null && root.right == null) return root.`val`
        count(root.left, root.`val`.toString())
        count(root.right, root.`val`.toString())
        return answer
    }

    fun count(currNode: TreeNode?, number: String) {
        if (currNode == null) return

        val nowNumber = number + currNode.`val`

        if (currNode.left == null && currNode.right == null) {
            answer += nowNumber.toInt()
        } else {
            count(currNode.left, nowNumber)
            count(currNode.right, nowNumber)
        }
    }
}