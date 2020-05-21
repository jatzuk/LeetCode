package problems.easy

import org.junit.Assert.assertArrayEquals
import org.junit.Test

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

class MergeSortedArrayKtTest {
    var nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    var nums2 = intArrayOf(2, 5, 6)

    @Test
    fun mergeTest() {
        merge(nums1, 3, nums2, 3)
        assertArrayEquals(intArrayOf(1, 2, 2, 3, 5, 6), nums1)

        nums1 = intArrayOf(4, 6, 7, 0, 0, 0)
        nums2 = intArrayOf(1, 2, 5)
        merge(nums1, 3, nums2, 3)
        assertArrayEquals(intArrayOf(1, 2, 4, 5, 6, 7), nums1)
    }
}
