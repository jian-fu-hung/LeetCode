package ExcelSheetColumnNumber

class Solution {
    fun titleToNumber(columnTitle: String): Int {

        var returnSum = 0.0

        var j = 0

        for(i in columnTitle.length-1 downTo 0){
            val tmp = columnTitle[i]-'A' + 1

            returnSum = returnSum + tmp * Math.pow(26.0,j.toDouble())

            j++

        }
        return returnSum.toInt()
    }
}