package Interview

class Solution {

    fun runTest() {
        println(test(listOf(7, 5, 3, 9, 7, 2)))
        println(test(listOf(9, 8, 7, 5, 3)))
        println(test(listOf(7, 5, 3, 5, 7, 2)))
        println(test(listOf(0)))
    }

    fun test(list: List<Int>): Int {
        // input： 7, 5, 3, 9, 7, 2
        // output： 6 （3 - 9） 找出差距最大的
        var max = 0
        for (i in list) {
            for (j in i until list.size) {
                if (list[j] > list[i]) {
                    val currMax = list[j] - list[i]
                    max = maxOf(max, currMax)
                }
            }
        }
        return max
    }
}