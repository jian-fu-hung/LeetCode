package SortTheJumbledNumbers

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.LinkedHashMap


class Solution {
    fun sortJumbled(mapping: IntArray, nums: IntArray): IntArray {

        var map: MutableMap<Int, ArrayList<Int>> = mutableMapOf()

        for(num in nums){
            var mappingNum = ""
            for(item in num.toString()){
                mappingNum += randomMapping(mapping, item.toString().toInt())
            }
            if(map.containsKey(mappingNum.toInt())){
                map[mappingNum.toInt()]!!.add(num)
            }else{
                map[mappingNum.toInt()] = ArrayList()
                map[mappingNum.toInt()]!!.add(num)
            }

        }

        var newmap = map.toList().sortedBy { (key, _ ) -> key}.toMap()

        var returnValue = arrayListOf<Int>()

        for(i in newmap.keys){
            for(num in newmap[i]!!.toList()){
                returnValue.add(num)
            }
        }
        return returnValue.toIntArray()

    }

    fun randomMapping(mapping: IntArray, num: Int) : String{
        return mapping[num].toString()
    }
}