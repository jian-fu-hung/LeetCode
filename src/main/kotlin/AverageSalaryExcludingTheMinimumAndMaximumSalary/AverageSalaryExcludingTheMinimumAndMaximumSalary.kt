package AverageSalaryExcludingTheMinimumAndMaximumSalary

class Solution {
    fun runTest() {
        println(average(intArrayOf(8000,9000,2000,3000,6000,1000)))
        println(average(intArrayOf(4000,3000,1000,2000)))
    }
    fun average(salary: IntArray): Double {
        salary.sort()
        var count = 0
        var max = 0
        for (i in salary.indices) {
            if (i == 0 || i == salary.size - 1) continue
            count++
            max += salary[i]
        }
        return max/count.toDouble()
    }
}