package ContainerWithMostWater

class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var max = 0
        while (left < right){
            val w = right - left
            val h = Math.min(height[left], height[right])
            val area = w * h
            max = Math.max(max, area)
            if(height[left] < height[right]) left++
            else if(height[left] > height[right]) right--
            else{
                left++
                right--
            }
        }
        return max
    }
}