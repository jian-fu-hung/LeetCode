package LastStoneWeight

import java.util.*
import kotlin.Comparator

class Solution {
    fun runTest() {
        lastStoneWeight(intArrayOf(2,7,4,1,8,1))
    }
    fun lastStoneWeight(stones: IntArray): Int {
        var queue = PriorityQueue<Int>(Collections.reverseOrder())
        stones.forEach {
            queue.offer(it)
        }

        while (queue.size > 1) {
            val one: Int = queue.poll()
            val two: Int = queue.poll()
            when {
                one > two -> {
                    val newItem = one - two
                    queue.offer(newItem)
                }
                one < two -> {
                    val newItem = two - one
                    queue.offer(newItem)
                }
            }
        }
        if (queue.size == 1) {
            return queue.peek()
        } else {
            return 0
        }
    }
}