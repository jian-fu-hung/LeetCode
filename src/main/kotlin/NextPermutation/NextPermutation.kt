package NextPermutation

class Solution {

    fun runTest(){
        nextPermutation(intArrayOf(1,2,3))
        nextPermutation(intArrayOf(3,2,1))
    }

    fun nextPermutation(nums: IntArray): Unit {
        var newNum = nums
        var left = nums.size - 2

        //找第一個小於右邊的
        while (left >= 0 && nums[left] >= nums[left+1]){
            left--
        }

        //找出第一個大於的
        if(left >= 0){
            var right = nums.size - 1
            while (right > 0 && nums[left] >= nums[right]){
                right--
            }

            change(newNum, left, right)
        }

        reverse(newNum, left + 1)
    }

    fun change(nums: IntArray, i: Int, j: Int){
        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }

    fun reverse(nums: IntArray, low: Int){
        var left = low
        var right = nums.size-1
        while (left < right){
            change(nums, left, right)
            left++
            right--
        }
    }


}