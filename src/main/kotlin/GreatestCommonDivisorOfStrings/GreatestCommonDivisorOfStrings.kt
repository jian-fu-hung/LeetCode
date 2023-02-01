package GreatestCommonDivisorOfStrings

class Solution {

    fun runTest() {
        println(gcdOfStrings("ABCABC", "ABC"))
    }
    fun gcdOfStrings(str1: String, str2: String): String {
        return if((str1+str2) == (str2+str1)) {
            str1.substring(0, hcf(str1.length, str2.length))
        } else ""
    }

    private fun hcf(n1: Int, n2: Int): Int {
        return if (n2 != 0)
            hcf(n2, n1 % n2)
        else
            n1
    }
}