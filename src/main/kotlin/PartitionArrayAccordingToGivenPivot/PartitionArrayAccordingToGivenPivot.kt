package PartitionArrayAccordingToGivenPivot

class Solution {
    fun runTest() {
        println(pivotArray(intArrayOf(9,12,5,10,14,3,10), 10).joinToString())
        println(pivotArray(intArrayOf(-3,4,3,2), 2).joinToString())
    }
    fun pivotArray(nums: IntArray, pivot: Int): IntArray {
        var beforeArray = mutableListOf<Int>()
        var afterArray = mutableListOf<Int>()
        var pivotArray = mutableListOf<Int>()
        var returnArray = mutableListOf<Int>()

        for (num in nums) {
            if (num == pivot) {
                pivotArray.add(num)
            } else if (num < pivot) {
                beforeArray.add(num)
            } else {
                afterArray.add(num)
            }
        }
        returnArray.addAll(beforeArray)
        returnArray.addAll(pivotArray)
        returnArray.addAll(afterArray)
        return returnArray.toIntArray()
    }
}