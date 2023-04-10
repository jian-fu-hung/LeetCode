package ValidParentheses

import java.util.LinkedList
import java.util.Stack

class Solution {

    fun runTest() {
        println( isValid("{}()[]"))
        println(isValid("{([])}"))
        println(isValid("{()[]}"))
        println(isValid("{([)]}"))
        println(isValid(""))
    }

    private val leftSymbol = arrayOf("(", "{", "[")
    private val rightSymbol = arrayOf(")", "}", "]")

    fun isValid(s: String): Boolean {
        val stack = LinkedList<String>()
        for (i in s) {
            var index = leftSymbol.indexOf(i.toString())
            if (index != -1) {
                stack.add(i.toString())
            } else {
                index = rightSymbol.indexOf(i.toString())
                if(stack.size > 0 && leftSymbol.indexOf(stack.last()) == index) {
                    stack.removeLast()
                } else {
                    return false
                }
            }
        }
        return stack.isEmpty()
    }
}