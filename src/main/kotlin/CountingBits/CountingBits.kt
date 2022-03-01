package CountingBits

class Solution {
    fun countBits(n: Int): IntArray {
        var returnArray:ArrayList<Int> = arrayListOf()

        for(i in 0..n){
            returnArray.add(solve(i))
        }
        return returnArray.toIntArray()
    }

    fun solve(num: Int): Int{
        if(num == 0) return 0
        if(num == 1) return 1
        return if(num % 2 == 0) solve(num/2)
        else 1 + solve(num/2)
    }
}