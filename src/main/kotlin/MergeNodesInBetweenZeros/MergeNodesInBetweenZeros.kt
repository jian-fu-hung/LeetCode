package MergeNodesInBetweenZeros

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun mergeNodes(head: ListNode?): ListNode? {
        var returnNode: ListNode? = null
        var returnCurrNode: ListNode? = null

        if(head == null) return returnNode

        var sum = head.`val` ?: 0

        var currNode = head.next



        while(currNode != null){
            if(currNode.`val` == 0){
                if(returnNode == null){
                    returnNode = ListNode(sum)
                    returnCurrNode = returnNode
                }else{
                    returnCurrNode?.next = ListNode(sum)
                    returnCurrNode = returnCurrNode?.next
                }
                sum = 0
            }
            else{
                sum += currNode.`val`
            }
            currNode = currNode.next
        }


        return returnNode
    }

}