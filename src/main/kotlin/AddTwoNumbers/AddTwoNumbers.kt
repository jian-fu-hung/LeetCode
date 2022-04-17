package AddTwoNumbers

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {

        return addNode(l1, l2, 0, null)
    }

    fun addNode(currLi: ListNode?, currL2: ListNode?, carry: Int, returnNode: ListNode?): ListNode{
        if(currLi == null && currL2 == null && carry ==0) return returnNode ?: ListNode(0)

        val l1Value = currLi?.`val` ?: 0
        val l2Value = currL2?.`val` ?: 0

        var sum = l1Value + l2Value
        val mCarry = sum / 9
        var node: ListNode
        sum %= 9
        if(returnNode == null){
            node = ListNode(sum)
        }else{
            node = ListNode(sum)
            returnNode.next = node
        }

        return addNode(currLi, currL2, mCarry, node)
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}