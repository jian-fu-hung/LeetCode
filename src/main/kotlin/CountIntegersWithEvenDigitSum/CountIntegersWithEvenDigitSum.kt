package CountIntegersWithEvenDigitSum

class Solution {
    fun countEven(num: Int): Int {
        var countEven = 0
        for (i in 1..num) {
            var value = i
            var sum = 0
            while(value >= 10){
                sum = sum + value%10
                value = value/10
            }
            sum = sum + value
            if (sum % 2 == 0) {
                print("ans $i = $sum\n")
                countEven++
            }

            print("$sum\n")

        }
        return countEven
    }
}