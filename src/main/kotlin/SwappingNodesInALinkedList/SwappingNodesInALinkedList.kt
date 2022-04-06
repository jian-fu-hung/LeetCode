package SwappingNodesInALinkedList

class Solution {
    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun runTest(){
        swapNodes(ListNode(1).apply{next = ListNode(2).apply{next = ListNode(3).apply{next = ListNode(4).apply{next = ListNode(5)} } } }, 2)
    }
    fun swapNodes(head: ListNode?, k: Int): ListNode? {

        var currNode = head
        var array = ArrayList<Int>()
        while (currNode != null){
            array.add(currNode.`val` )
            currNode = currNode.next
        }

        if(array.size == 1){
            return head
        }

        val left = k - 1
        val right = array.size - k
        val temp = array[left]
        array[left] = array[right]
        array[right] = temp

        var returnNode = ListNode(array[0])
        var returnCurrNode = returnNode
        for(i in 1..array.size-2){
            val node = ListNode(array[i])
            returnCurrNode.next = node
            returnCurrNode = returnCurrNode.next!!
        }
        val lastNode = ListNode(array[array.size-1])
        returnCurrNode.next = lastNode
        return returnNode
    }
}