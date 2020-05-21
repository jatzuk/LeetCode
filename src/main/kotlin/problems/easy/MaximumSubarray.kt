package problems.easy

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 26-Dec-18
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

// O(n^2)
// O(1)
fun maxSubArray(nums: IntArray): Int {
    var sum = Int.MIN_VALUE
    for (i in 0 until nums.size) {
        var subSum = 0
        for (j in i until nums.size) {
            subSum += nums[j]
            sum = if (subSum > sum) subSum else sum
        }
    }
    return sum
}

// O(n)
// O(1)
fun maxSubArrayLinear(nums: IntArray): Int {
    var sum = Int.MIN_VALUE
    var partialSum = 0
    for (i in 0 until nums.size) {
        partialSum += nums[i]
        sum = if (partialSum > sum) partialSum else sum
        if (partialSum < 0) partialSum = 0
    }
    return sum
}

// O(n log n)
// O(n - 1)
fun maxSubArrayDivideAndConquer(nums: IntArray, left: Int, right: Int): Int {
    if (left > right) return Int.MIN_VALUE
    if (left == right) return nums[left]
    val mid = (left + right) / 2
    val leftPtr = maxSubArrayDivideAndConquer(nums, left, mid - 1)
    val rightPtr = maxSubArrayDivideAndConquer(nums, mid + 1, right)
    var leftSum = 0
    var tmp = 0
    for (i in mid - 1 downTo left) {
        tmp += nums[i]
        if (tmp > leftSum) leftSum = tmp
    }
    tmp = 0
    var rightSum = 0
    for (i in mid + 1 until right) {
        tmp += nums[i]
        if (tmp > rightSum) rightSum = tmp
    }
    return Math.max(Math.max(leftPtr, rightPtr), leftSum + rightSum + nums[mid])
}
