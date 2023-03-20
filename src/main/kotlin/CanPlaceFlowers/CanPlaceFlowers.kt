package CanPlaceFlowers

class Solution {

    fun runTest() {
        println(canPlaceFlowers(intArrayOf(1,0,0,0,1), 1))
        println(canPlaceFlowers(intArrayOf(1,0,0,0,1), 2))
    }

    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var list = flowerbed
        var count = 0
        if (n == 0) return true
        for (i in list.indices) {
            if (i == 0) {
                if (flowerbed.size == 1 && list[0] != 1) {
                    count++
                    list[i] = 1
                } else if (list[0] != 1 && list[1] != 1) {
                    count++
                    list[i] = 1
                }
            } else if (i == list.size - 1) {
                if (list[i] != 1 && list[i-1] != 1) {
                    count++
                    list[i] = 1
                }
            } else {
                if(list[i] != 1 && list[i+1] != 1 && list[i-1] != 1) {
                    count++
                    list[i] = 1
                }
            }
            if (count == n) {
                return true
            }
            if (count > n) {
                return false
            }
        }
        return false
    }
}