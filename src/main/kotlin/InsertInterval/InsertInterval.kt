package InsertInterval

class Solution {
    fun runTest() {
        println(insert(arrayOf(intArrayOf(1,3), intArrayOf(6,9)), intArrayOf(2,5)))
        println(insert(arrayOf(intArrayOf(1,2), intArrayOf(3,5), intArrayOf(6,7), intArrayOf(8,10), intArrayOf(12,16)), intArrayOf(4,8)))
    }
    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
        var returnArray = arrayListOf<IntArray>()
        var mergeInterval = newInterval
        for(interval in intervals) {
            if (interval[1] < newInterval[0]) {
                returnArray.add(interval)
            } else if (interval[0] > mergeInterval[1]) {
                returnArray.add(mergeInterval)
                mergeInterval = interval
            } else if (interval[1] >= mergeInterval[0]) {
                mergeInterval[0] = Math.min(mergeInterval[0], interval[0])
                mergeInterval[1] = Math.max(mergeInterval[1], interval[1])
            }
        }
        returnArray.add(mergeInterval)
        return returnArray.toTypedArray()
    }
}