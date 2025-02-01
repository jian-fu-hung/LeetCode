package SpecialArrayI

class Solution {
    fun runTest() {
        println(isArraySpecial(intArrayOf(1)))
        println(isArraySpecial(intArrayOf(2, 1, 4)))
        println(isArraySpecial(intArrayOf(4, 3, 1, 6)))
    }
    fun isArraySpecial(nums: IntArray): Boolean {
        if (nums.size < 2) return true
        var lastIsOdd: Boolean? = null
        for (num in nums) {
            if (lastIsOdd == null) {
                lastIsOdd = isOdd(num)
            } else {
                val currIsOdd = isOdd(num)
                if (lastIsOdd == currIsOdd) {
                    return false
                }
                lastIsOdd = currIsOdd
            }

        }
        return true
    }

    private fun isOdd(num: Int): Boolean {
        return num%2 != 0
    }
}