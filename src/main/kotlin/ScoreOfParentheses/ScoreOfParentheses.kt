package ScoreOfParentheses

import java.util.*
import kotlin.math.max

class Solution {
    fun scoreOfParentheses(s: String): Int {
        var st = Stack<Int>()
        var score = 0
        for(i in 0..s.length-1){
            if(s[i] == '('){
                st.push(score)
                score = 0
            }
            else if(s[i] == ')'){
                score = st.peek() + Math.max(2 * score, 1)
                st.pop()
            }
        }
        return score
    }
}