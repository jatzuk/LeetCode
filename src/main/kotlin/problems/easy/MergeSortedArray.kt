package problems.easy

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 09-Jan-19
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
    var i = m - 1
    var j = n - 1
    var ptr = m + n - 1
    while (i > -1 && j > -1) {
        if (nums1[i] > nums2[j]) nums1[ptr] = nums1[i--]
        else nums1[ptr] = nums2[j--]
        ptr--
    }

    while (j > -1) nums1[ptr--] = nums2[j--]
}
