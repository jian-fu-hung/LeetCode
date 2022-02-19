package RemoveKDigits

import java.util.*


class Solution {
    fun removeKdigits(num: String, k: Int): String {
        if (num.length == k) return "0"
        var stringBuilder = StringBuilder()
        var k = k
        var i = 0

        while(i < num.length){
            while ( k > 0 && stringBuilder.isNotEmpty() && stringBuilder.last() > num[i]){
                stringBuilder.deleteCharAt(stringBuilder.length-1)
                k--
            }
            stringBuilder.append(num[i])
            i++
        }

        while(k > 0){
            stringBuilder.deleteCharAt(stringBuilder.length-1)
            k--
        }

        while(stringBuilder.startsWith("0")){
            stringBuilder.deleteCharAt(0)
        }

        return if (stringBuilder.isEmpty()) "0" else stringBuilder.toString()
    }
}