package problems.easy

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

// O(n)
// O(1)
fun removeElement(nums: IntArray, value: Int): Int {
    if (nums.isEmpty()) return 0
    var j = 0
    for (i in 0 until nums.size) if (nums[i] != value) nums[j++] = nums[i]
    return j
}
