package FindThePunishmentNumberOfAnInteger


class Solution {
    fun runTest() {
        println(punishmentNumber(10))
        println(punishmentNumber(37))
    }

    fun punishmentNumber(n: Int): Int {
        var countNumber = 0
        for (i in 1..n) {
            val squareNum = i * i
            if (findPartitions(squareNum, i)) {
                countNumber += squareNum
            }
        }
        return countNumber
    }

    private fun findPartitions(num: Int, target: Int): Boolean {
        if (num <= 0 || target <= 0) {
            return false
        }
        if (num == target) {
            return true
        }
        return findPartitions(num/10, target-(num%10))
                || findPartitions(num/100, target-(num%100))
                || findPartitions(num/1000, target-(num%1000))
    }


}