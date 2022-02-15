package SingleNumber

class Solution {
    fun singleNumber(nums: IntArray): Int {
        var hashMap: MutableMap<Int, Int> = mutableMapOf()

        for(num in nums){
            if(!hashMap.containsKey(num)){
                hashMap[num] = 1
            }else{
                hashMap[num] = hashMap[num]!! + 1
            }

        }

        for(i in hashMap){
            if(i.value == 1){
                return i.key
            }
        }
        return 0
    }
}