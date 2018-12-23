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

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    var i = 0
    for (j in 1 until nums.size) if (nums[j] > nums[i]) nums[++i] = nums[j]
    return ++i
}
