package CombinationSum

class Solution {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {

        val returnList: ArrayList<ArrayList<Int>> = arrayListOf()

        candidates.sort()

        for(i in 0.. candidates.size-1){
            dsf(candidates, i, candidates[i], target, arrayListOf(candidates[i]), returnList)
        }
        return returnList
    }

    private fun dsf(candidates: IntArray, index: Int, sum: Int, target: Int, currList: ArrayList<Int>, returnList: ArrayList<ArrayList<Int>>){
        if(sum > target) return
        if(sum == target){
            returnList.add(currList)
            return
        }
        for(i in index until candidates.size){
            var s = sum + candidates[i]
            val c = ArrayList<Int>(currList)
            c.add(candidates[i])
            dsf(candidates, i, s, target, c, returnList)
        }
    }
}