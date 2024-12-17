package ConstructStringWithRepeatLimit

class Solution {

    fun runTest() {
        repeatLimitedString("ccczaazzzcc", 3)
    }

    fun repeatLimitedString(s: String, repeatLimit: Int): String {
        val mList = IntArray(26)
        for (i in s) {
            mList[i - 'a']++
        }
        val strBuilder = StringBuilder()
        var currentCharIndex = 25
        while (currentCharIndex >= 0) {
            if (mList[currentCharIndex] == 0) {
                currentCharIndex--
                continue
            }
            val min = Math.min(mList[currentCharIndex], repeatLimit)
            for(i in 0 until min) {
                strBuilder.append('a' + currentCharIndex)
            }
            mList[currentCharIndex] -= min
            if (mList[currentCharIndex] > 0) {
                var smallerCharIndex = currentCharIndex - 1
                while (smallerCharIndex >= 0 && mList[smallerCharIndex] == 0) {
                    smallerCharIndex--
                }
                if (smallerCharIndex < 0) {
                    break
                }
                strBuilder.append('a' + smallerCharIndex)
                mList[smallerCharIndex]--
            }
        }
        return strBuilder.toString()
    }
}