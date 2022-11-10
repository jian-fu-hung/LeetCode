package RemoveAllAdjacentDuplicatesInString

import java.util.*

class Solution {

    fun runTest() {
        removeDuplicates("abbaca")
    }
    fun removeDuplicates(s: String): String {
        var stack = ArrayDeque<Char>()
        var stringBuilder = StringBuilder()
        for (i in s) {
            if (stack.isEmpty()) {
                stack.addFirst(i)
            } else if (stack.first() == i) {
                stack.removeFirst()
            } else {
                stack.add(i)
            }
        }

        while (stack.isEmpty().not()) {
            stringBuilder.append(stack.removeFirst())
        }

        return stringBuilder.toString().reversed()
    }
}