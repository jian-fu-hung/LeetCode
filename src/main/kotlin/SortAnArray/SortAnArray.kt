package SortAnArray

class Solution {

    fun runTest() {
        println(sortArray(intArrayOf(1)))
        println(sortArray(intArrayOf(2, 1)))
        println(sortArray(intArrayOf(5, 4, 3, 2, 1)))
    }

    fun sortArray(nums: IntArray): IntArray {
        if(nums.size <= 1) return nums
        val middle = nums.size / 2
        return divide(nums.copyOfRange(0, middle), nums.copyOfRange(middle, nums.size))
    }

    private fun divide(left: IntArray, right: IntArray): IntArray {
        val leftSort = if (left.size > 1) {
            val middle = left.size / 2
            divide(left.copyOfRange(0, middle), left.copyOfRange(middle, left.size))
        } else {
            left
        }

        val rightSort = if (right.size > 1) {
            val middle = right.size / 2
            divide(right.copyOfRange(0, middle), right.copyOfRange(middle, right.size))
        } else {
            right
        }
        return mergeList(leftSort, rightSort)
    }

    private fun mergeList(left: IntArray, right: IntArray): IntArray {
        var list = arrayListOf<Int>()
        var leftIndex = 0
        var rightIndex = 0
        while (leftIndex < left.size && rightIndex < right.size) {
            if(left[leftIndex] < right[rightIndex]) {
                list.add(left[leftIndex])
                leftIndex++
            } else {
                list.add(right[rightIndex])
                rightIndex++
            }
        }
        for (i in leftIndex until left.size) {
            list.add(left[i])
        }

        for (i in rightIndex until right.size) {
            list.add(right[i])
        }

        return list.toIntArray()
    }
}