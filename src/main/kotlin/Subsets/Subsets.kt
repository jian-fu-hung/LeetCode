package Subsets
class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        var output : ArrayList<ArrayList<Int>> = arrayListOf()

        output.add(ArrayList())

        for(num in nums){

            var newSub: ArrayList<ArrayList<Int>> = arrayListOf()

            for(j in output){
                val b= ArrayList<Int>(j)
                b.add(num)
                newSub.add(b)
            }

            for(j in newSub){
                output.add(j)
            }
        }

        return output
    }
}