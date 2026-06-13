package WeightedWordMapping

class Solution {

    fun runTest() {
        println(mapWordWeights(arrayOf("abcd","def","xyz"), intArrayOf(5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2)))
    }

    fun mapWordWeights(words: Array<String>, weights: IntArray): String {
        var result = ""
        for (word in words) {
            var sum = 0
            word.forEach { charest ->
                val num = charest - 'a'
                sum += weights[num]
            }
            result += (122 - sum%26).toChar().toString()
        }
        return result
    }
}