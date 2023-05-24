package MaximumSubsequenceScore

import java.util.*

class Solution {
    fun runTest() {
        println(maxScore(intArrayOf(1,3,3,2), intArrayOf(2,1,3,4), 3))
    }
    fun maxScore(nums1: IntArray, nums2: IntArray, k: Int): Long {
        val n = nums1.size
        var res: Long = 0
        var totalSum: Long = 0
        val pairs = Array(n) { IntArray(2) }
        for (i in 0 until n) {
            pairs[i] = intArrayOf(nums2[i], nums1[i])
        }
        // num2排序
        Arrays.sort(pairs) { a, b -> b[0] - a[0] }


        val pq: PriorityQueue<Int> = PriorityQueue(k) { a, b -> a - b }
        for (pair in pairs) {
            pq.add(pair[1])
            totalSum += pair[1]
            if (pq.size > k) {
                totalSum -= pq.poll()
            }
            if (pq.size == k) {
                res = Math.max(res, totalSum * pair[0])
            }
        }
        return res
    }
}