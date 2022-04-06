package ValidPalindromeII

class Solution {

    fun runTest(){
        println(validPalindrome("aba"))
        println(validPalindrome("abca"))
        println(validPalindrome("a"))
    }

    fun validPalindrome(s: String): Boolean {
        var i = 0
        var j = s.length-1

        while(i <= j){
            if(s[i] == s[j]){
                i++
                j--
            } else{
                return isPalindrome(i + 1, j, s) || isPalindrome(i, j - 1, s)
            }
        }

        return true
    }

    private fun isPalindrome(i: Int, j: Int, s: String): Boolean{
        var i = i
        var j = j
        while (i <=j ){
            if(s[i] == s[j]){
                i++
                j--
            } else return false
        }
        return true
    }


}