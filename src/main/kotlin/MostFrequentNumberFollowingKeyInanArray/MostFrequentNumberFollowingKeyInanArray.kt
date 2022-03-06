package MostFrequentNumberFollowingKeyInanArray

class Solution {
    fun mostFrequent(nums: IntArray, key: Int): Int {

        var maps : MutableMap<Int, Int> = mutableMapOf()

        for(i in 0..nums.size-2){
            if(nums[i] == key){
                if(maps.containsKey(nums[i+1])){
                    maps[nums[i+1]] = maps[nums[i+1]]!! + 1
                }else{
                    maps[nums[i+1]] = 1
                }
            }
        }

        var max = 0
        var num = 0

        for(key in maps.keys){
            if(maps[key]!! > max){
                max = maps[key]!!
                num = key
            }
        }

        return num
    }
}