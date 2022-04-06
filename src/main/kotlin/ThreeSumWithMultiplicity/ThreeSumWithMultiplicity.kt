package ThreeSumWithMultiplicity

class Solution {
    fun threeSumMulti(arr: IntArray, target: Int): Int {
        val c = LongArray(101)
        for (a in arr) c[a]++
        var res: Long = 0
        for (i in 0..100) for (j in i..100) {
            val k = target - i - j
            if (k > 100 || k < 0) continue
            if (i == j && j == k) res += c[i] * (c[i] - 1) * (c[i] - 2) / 6 else if (i == j && j != k) res += c[i] * (c[i] - 1) / 2 * c[k] else if (j < k) res += c[i] * c[j] * c[k]
        }
        return (res % (1e9 + 7)).toInt()
    }
}