package ReverseString

class Solution {
    fun runTest(){
        reverseString(charArrayOf('h','e','l','l','o'))
    }

    fun reverseString(s: CharArray): Unit {
        s.reverse()
    }
}