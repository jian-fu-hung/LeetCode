package MinimumDominoRotationsForEqualRow

import kotlin.math.min

class Solution {
    fun minDominoRotations(tops: IntArray, bottoms: IntArray): Int {
        val faceA: MutableMap<Int, Int> = mutableMapOf()
        val faceB: MutableMap<Int, Int> = mutableMapOf()
        val same: MutableMap<Int, Int> = mutableMapOf()

        for(i in 0..tops.size-1){
            if(faceA.containsKey(tops[i])){
                faceA[tops[i]] = faceA[tops[i]]!! + 1
            }else{
                faceA[tops[i]] = 1
            }

            if(faceB.containsKey(bottoms[i])){
                faceB[bottoms[i]] = faceB[bottoms[i]]!! + 1
            }else{
                faceB[bottoms[i]] = 1
            }

            if(tops[i] == bottoms[i]){
                if(same.containsKey(tops[i])){
                    same[tops[i]] = same[tops[i]]!! +1
                }else{
                    same[tops[i]] = 1
                }
            }
        }

        var minRotation = Int.MAX_VALUE

        for(i in 1..6){
            if((faceA[i] ?: 0) + (faceB[i] ?: 0) - (same[i] ?: 0) == tops.size){
                minRotation = Math.min(minRotation, (Math.min((faceA[i] ?: 0)  ,(faceB[i] ?: 0)) - (same[i] ?: 0)))
            }
        }

        return if(minRotation == Int.MAX_VALUE) -1 else minRotation
    }
}