package algorithms.easy

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 23.12.2018
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

// O(n) // degrades to O(n^2)
// O(1)
fun searchInsert(nums: IntArray, target: Int): Int {
    if (nums.isEmpty()) return 0
    for ((i, n) in nums.withIndex()) if (n == target) return i
    for (i in 0 until nums.size) if (nums[i] > target) return i
    return nums.size
}