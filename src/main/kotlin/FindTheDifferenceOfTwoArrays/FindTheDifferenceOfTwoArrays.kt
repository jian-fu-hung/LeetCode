package FindTheDifferenceOfTwoArrays

class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {

        val map1: MutableMap<Int, Int> = mutableMapOf()
        val map2: MutableMap<Int, Int> = mutableMapOf()

        val returnNum1 = ArrayList<Int>()
        val returnNum2 = ArrayList<Int>()
        val returnList = ArrayList<ArrayList<Int>>()

        for (i in nums1) {
            if (map1.containsKey(i)) {
                map1[i] = map1[i]!! + 1
            } else {
                map1[i] = 1
            }
        }

        for (i in nums2) {
            if (map2.containsKey(i)) {
                map2[i] = map2[i]!! + 1
            } else {
                map2[i] = 1
            }
        }



        for (i in map1.keys.toList()) {
            if (!map2.containsKey(i)) {
                returnNum1.add(i)
            }
        }
        for (i in map2.keys.toList()) {
            if (!map1.containsKey(i)) {
                returnNum2.add(i)
            }
        }

        returnList.add(returnNum1)
        returnList.add(returnNum2)
        return returnList
    }
}