package algorithms.easy

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
        var fixSum = 0
        for (j in i until nums.size) {
            fixSum += nums[j]
            sum = if (fixSum > sum) fixSum else sum
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