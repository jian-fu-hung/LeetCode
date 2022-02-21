package MajorityElement

class Solution {
    fun majorityElement(nums: IntArray): Int {
        var hashMap: MutableMap<Int, Int> = mutableMapOf()
        var max = 0
        var returnInt = 0

        for(i in nums){
            if(!hashMap.containsKey(i)){
                hashMap[i] = 1
            }else {
                hashMap[i] = hashMap[i]!! + 1
            }
        }

        for(i in hashMap.entries){
            if(i.value > max){
                max = i.value
                returnInt = i.key
            }
        }

        return returnInt
    }
}