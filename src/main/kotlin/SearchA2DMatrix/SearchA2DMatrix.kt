package SearchA2DMatrix

class Solution {

    fun runTest(){
        println(searchMatrix(arrayOf(intArrayOf(1,3,5,7), intArrayOf(10,11,16,20), intArrayOf(23,30,34,60)), 3))
        println(searchMatrix(arrayOf(intArrayOf(1,3,5,7), intArrayOf(10,11,16,20), intArrayOf(23,30,34,60)), 13))
    }

    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {

        val row = matrix.size
        val col = matrix[0].size

        if(matrix[0][0] > target || matrix[row-1][col-1] < target){
            return false
        }

        for(i in 0..row-1){
            if(target >= matrix[i][0] && target <= matrix[i][col-1]){
                if(binarySearch(matrix[i], target) != -1){
                    return true
                }
            }
        }

        return false
    }

    private fun binarySearch(intArray: IntArray, target: Int): Int{
        var start = 0
        var end = intArray.size-1
        while (start <= end){
            val mid = start + (end - start)/2
            if(intArray[mid] > target){
                end = mid -1
            } else if(intArray[mid] < target){
                start = mid +1
            }else{
                return mid
            }
        }
        return -1
    }
}