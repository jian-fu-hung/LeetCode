package MergeStringsAlternately

class Solution {

    fun runTest() {
        println(mergeAlternately("abc", "pqr"))
        println(mergeAlternately("ab", "pqrs"))
        println(mergeAlternately("abcd", "pq"))
    }
    fun mergeAlternately(word1: String, word2: String): String {
        var word1Length = word1.length
        var word2Length = word2.length
        var word1Position = 0
        var word2Position = 0
        var returnStr = StringBuilder()
        while (word1Position < word1Length || word2Position < word2Length) {
            if (word1Position < word1Length) {
                returnStr.append(word1[word1Position])
                word1Position ++
            }

            if (word2Position < word2Length) {
                returnStr.append(word2[word2Position])
                word2Position ++
            }
        }
        return returnStr.toString()
    }
}