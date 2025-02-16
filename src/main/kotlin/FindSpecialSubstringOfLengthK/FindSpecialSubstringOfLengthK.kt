package FindSpecialSubstringOfLengthK

class Solution {
    fun runTest() {
        println(hasSpecialSubstring("aaabaaa", 3))
        println(hasSpecialSubstring("abc", 2))
        println(hasSpecialSubstring("jkjhfgg", 2))

    }
    fun hasSpecialSubstring(s: String, k: Int): Boolean {
        var nowCount = 0
        var nowChar = ""
        s.forEach { char ->
            if (nowChar == "" ) {
                nowChar = char.toString()
                nowCount = 1
            } else {
                if (nowChar == char.toString()) {
                    nowCount++
                } else {
                    if (nowCount == k) {
                        return true
                    } else {
                        nowChar = char.toString()
                        nowCount = 1
                    }
                }
            }
        }
        return nowCount == k
    }
}