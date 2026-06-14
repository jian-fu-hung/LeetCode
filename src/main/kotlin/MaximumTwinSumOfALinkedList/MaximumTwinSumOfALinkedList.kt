package MaximumTwinSumOfALinkedList

class Solution {

    fun runTest() {
        println(
            pairSum(
                ListNode(5).apply {
                    next = ListNode(4).apply {
                        next = ListNode(2).apply {
                            next = ListNode(1)
                        }
                    }
                }
            )
        )
        println(
            pairSum(
                ListNode(4).apply {
                    next = ListNode(2).apply {
                        next = ListNode(2).apply {
                            next = ListNode(3)
                        }
                    }
                }
            )
        )
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun pairSum(head: ListNode?): Int {
        if (head?.next == null) {
            return head?.`val` ?: 0
        }


//        val list = mutableListOf<Int>()
//        var next: ListNode? = head
//        while (next?.`val` != null) {
//            list.add(next.`val`)
//            next = next.next
//        }
//        for (i in 0 until list.size/2) {
//            val max = list[i] + list[list.size - 1 - i]
//            result = Math.max(result, max)
//        }

        var result = 0
        var tempHead: ListNode? = head
        // step1.  找出中間
        var fast = head
        var slow = head // 為中間起點
        while (fast != null && fast.next != null) {
            fast = fast?.next?.next
            slow = slow?.next
        }

        // step2.  進行反轉
        var prev: ListNode? = null
        var curr: ListNode? = slow
        while (curr != null) {
            val temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        }

        // step3.  比大小
        while (tempHead != null || prev != null) {
            val max = (tempHead?.`val` ?: 0) + (prev?.`val` ?: 0)
            result = Math.max(max, result)
            tempHead = tempHead?.next
            prev = prev?.next
        }

        return result
    }
}