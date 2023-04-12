package SimplifyPath

import java.util.*

class Solution {
    fun runTest() {
        println(simplifyPath("/home/"))
        println(simplifyPath("//"))
        println(simplifyPath("/../"))
        println(simplifyPath("/a/./b/../../c/"))
        println(simplifyPath("/a//b////c/d//././/.."))

    }
    fun simplifyPath(path: String): String {
        val stack = LinkedList<String>()
        val list = path.split('/')
        for (item in list) {
            if (item == "." || item.isEmpty()) {

            } else if (item == "..") {
                if (!stack.isEmpty()) {
                    stack.removeLast()
                }
            } else {
                stack.add(item)
            }
        }
        var str = ""
        for (i in 0 until stack.size) {
            str += if (i == stack.lastIndex) {
                "$stack[i]"
            } else {
                "$stack[i]/"
            }
        }
        return "/$str"
    }
}