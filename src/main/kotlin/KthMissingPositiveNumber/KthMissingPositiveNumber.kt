package KthMissingPositiveNumber

class Solution {
    fun runTest() {
        println(findKthPositive(intArrayOf(2, 3, 4, 7, 11), 5))
        println(findKthPositive(intArrayOf(1, 2, 3, 4), 2))
    }
    fun findKthPositive(arr: IntArray, k: Int): Int {
        var nowMissingPosition = 0

        var nextArrayPosition = 0
        var i = 0
        while (nowMissingPosition != k){
            i++
            if (i != arr[nextArrayPosition]) {
                nowMissingPosition++
            } else {
                if(nextArrayPosition < arr.size - 1) {
                    nextArrayPosition++
                }
            }
        }
        return i
    }

    fun findKthPositive2(arr: IntArray, k: Int): Int {
        var lo = 0
        var hi = arr.size
        while (lo < hi) {
            var mid = lo + (hi-lo) / 2
            if(arr[mid] - mid > k) hi = mid
            else lo = mid + 1
        }
        return lo + k
    }
}