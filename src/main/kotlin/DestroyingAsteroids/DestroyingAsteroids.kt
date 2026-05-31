package DestroyingAsteroids

class Solution {

    fun runTest() {
        println(asteroidsDestroyed(10, intArrayOf(9,19,5,3,21)))
        println(asteroidsDestroyed(5, intArrayOf(4,9,23,4)))
        println(asteroidsDestroyed(5, intArrayOf(9,4,23,4)))
    }

    fun asteroidsDestroyed(mass: Int, asteroids: IntArray): Boolean {
        var max = mass.toLong()
        asteroids.sort()
        asteroids.forEach { asteroid ->
            if (max < asteroid) return false
            max += asteroid
        }
        return true
    }
}