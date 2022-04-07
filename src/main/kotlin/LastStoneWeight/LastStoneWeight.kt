package LastStoneWeight

class Solution {



    fun lastStoneWeight(stones: IntArray): Int {

        var array = stones
        array.sort()
        while (array.size > 1){
            array = destroyed(array)
            array.sort()
        }
        if(array.size <= 0 ){
            return 0
        }
        return array[0]

    }

    fun destroyed(array: IntArray): IntArray{
        val a = array.size-1
        val b = a - 1
        val mutableMap = array.toMutableList()
        mutableMap.removeAt(a)
        mutableMap.removeAt(b)
        if(array[a] - array[b] != 0){
            mutableMap.add(array[a] - array[b])
        }
        return mutableMap.toIntArray()
    }


}