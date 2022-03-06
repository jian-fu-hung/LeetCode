package CellsInARangeOnAnExcelSheet

class Solution {
    fun cellsInRange(s: String): List<String> {
        val inputList = s.split(":")
        val returnList: ArrayList<String> = arrayListOf()

        for(i in inputList[0][0]..inputList[1][0]){
            for(j in inputList[0][1]..inputList[1][1]){
                returnList.add("$i$j")
            }

        }
        return returnList
    }
}