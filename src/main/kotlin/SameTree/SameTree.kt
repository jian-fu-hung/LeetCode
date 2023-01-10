package SameTree

class Solution {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun runTest() {
        println(isSameTree(
            p = TreeNode(1).apply {
                left = TreeNode(2)
                right = TreeNode(3)
            },
            q = TreeNode(1).apply {
                left = TreeNode(2)
                right = TreeNode(3)
            }
        ))
        println(isSameTree(
            p = TreeNode(1).apply {
                left = TreeNode(2)
                right = TreeNode(3)
            },
            q = TreeNode(1).apply {
                left = TreeNode(2)
            }
        ))
        println(isSameTree(
            p = TreeNode(1).apply {
                left = TreeNode(2)
                right = TreeNode(1)
            },
            q = TreeNode(1).apply {
                left = TreeNode(1)
                right = TreeNode(2)
            }
        ))

    }

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if(p == null && q == null) return true
        return if(p?.`val` == q?.`val`) {
            val left = isSameTree(p?.left, q?.left)
            val right = isSameTree(p?.right, q?.right)
            left && right
        } else {
            false
        }
    }
}