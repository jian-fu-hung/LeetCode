import SortList.Solution
import java.util.*

fun main(args: Array<String>) {

    //78. Subsets
//    val subsets =Subsets.Solution()
//    var nums: IntArray = intArrayOf(1,2,3)
//    print(subsets.subsets(nums))

    //104. Maximum Depth of Binary Tree
//    val solution = MaximumDepthofBinaryTree.Solution()
//    var input = Solution.TreeNode(3)
//    var input9 = Solution.TreeNode(9)
//    var input20 = Solution.TreeNode(20)
//    var input15 = Solution.TreeNode(15)
//    var input7 = Solution.TreeNode(7)
//    input.left = input9
//    input.right = input20
//    input20.left = input15
//    input20.right = input7
//
//    solution.maxDepth(input)

    //402. Remove K Digits
//    val solution = RemoveKDigits.Solution()
//    print(solution.removeKdigits("1173", 2))

    //39. Combination Sum
//    val solution = CombinationSum.Solution()
//    print((solution.combinationSum(intArrayOf(2,3,6,7), 7)))

    //6012. Count Integers With Even Digit Sum
//    val solution = CountIntegersWithEvenDigitSum.Solution()
//    print(solution.countEven(896))

    //6013. Merge Nodes in Between Zeros
//    val solution = MergeNodesInBetweenZeros.Solution()
//    var input = MergeNodesInBetweenZeros.ListNode(0)
//    var input1 = MergeNodesInBetweenZeros.ListNode(1)
//    var input2 = MergeNodesInBetweenZeros.ListNode(3)
//    var input3 = MergeNodesInBetweenZeros.ListNode(0)
//    var input4 = MergeNodesInBetweenZeros.ListNode(7)
//    var inputFinal = MergeNodesInBetweenZeros.ListNode(0)
//    input.next = input1
//    input1.next = input2
//    input2.next = input3
//    input3.next = input4
//    input4.next = inputFinal
//    print(solution.mergeNodes(input).toString())

    //171. Excel Sheet Column Number
//    val solution = ExcelSheetColumnNumber.Solution()
//    print( solution.titleToNumber("AB"))

    //148. Sort List
//    val solution = SortList.Solution()
//    val input1 = Solution.ListNode(4)
//    val input2 = Solution.ListNode(2)
//    val input3 = Solution.ListNode(1)
//    val input4 = Solution.ListNode(3)
//    input1.next = input2
//    input2.next = input3
//    input3.next = input4
//    print(solution.sortList(input1))

    //338. Counting Bits
//    val solution = CountingBits.Solution()
//    print(solution.countBits(5).toString())

//    val solution = MostFrequentNumberFollowingKeyInanArray.Solution()
//    print(solution.mostFrequent(intArrayOf(1,100,2,1,100), 1))

//    val solution = SortTheJumbledNumbers.Solution()
//    print(solution.sortJumbled(intArrayOf(8,9,4,0,2,1,3,5,7,6), intArrayOf(77,77,38)))

//    val solution = CellsInARangeOnAnExcelSheet.Solution()
//    print(solution.cellsInRange("A1:C1"))

//    val solution = AppendKIntegersWithMinimalSum.Solution()
//    print(solution.minimalKSum(intArrayOf(93,44,49,45,93,52,6,7,88,70,86,15,38,86,86,95,8,62,13,84,26,16,33,85,7,62,55,50,77,10,76,10,35,67,19,12,24,39,76,37), 17))
//    println(solution.minimalKSum(intArrayOf(1,3,3,4,6),5))
//    print(solution.minimalKSum(intArrayOf(5,6), 6))

//    val solution = AddTwoNumbers.Solution()
//    val l1 = AddTwoNumbers.Solution.ListNode(2).apply {
//        next = AddTwoNumbers.Solution.ListNode(3).apply {
//            next = AddTwoNumbers.Solution.ListNode(4)
//        }
//    }
//
//    val l2 = AddTwoNumbers.Solution.ListNode(5).apply {
//        next = AddTwoNumbers.Solution.ListNode(6).apply {
//            next = AddTwoNumbers.Solution.ListNode(4)
//        }
//    }
//    solution.addTwoNumbers(l1, l2)

    //856. Score of Parentheses
    val solution = ScoreOfParentheses.Solution()
    solution.scoreOfParentheses("(56)()")
}