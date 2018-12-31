package algorithms.easy

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 31-Dec-18
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

class PlusOne {
    @Test
    fun plusOneTest() {
        assertArrayEquals(intArrayOf(1, 2, 4), plusOne(intArrayOf(1, 2, 3)))
        assertArrayEquals(intArrayOf(4, 3, 2, 2), plusOne(intArrayOf(4, 3, 2, 1)))
        assertArrayEquals(intArrayOf(9, 0, 0, 0), plusOne(intArrayOf(8, 9, 9, 9)))
        assertArrayEquals(intArrayOf(1, 0), plusOne(intArrayOf(9)))
        assertArrayEquals(intArrayOf(1, 0, 0), plusOne(intArrayOf(9, 9)))
    }
}