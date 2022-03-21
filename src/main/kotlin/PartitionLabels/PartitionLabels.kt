package PartitionLabels

class Solution {
    fun partitionLabels(s: String): List<Int> {
        var last = IntArray(26)
        for(i in 0..s.length-1){
            last[(s[i] - 'a')] = i
        }

        val ans = ArrayList<Int>()
        var max = 0
        var anchor = 0
        for(i in 0.. s.length-1){
            max = Math.max(max, last[(s[i] - 'a')])
            if(i == max){
                ans.add( i - anchor + 1)
                anchor = i +1
            }
        }
        return ans
    }
}