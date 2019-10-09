package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test

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

class SearchInsertPositionKtTest {
    @Test
    fun searchInsertTest() {
        assertEquals(2, searchInsert(intArrayOf(1, 3, 5, 6), 5))
        assertEquals(1, searchInsert(intArrayOf(1, 3, 5, 6), 2))
        assertEquals(4, searchInsert(intArrayOf(1, 3, 5, 6), 7))
        assertEquals(0, searchInsert(intArrayOf(1, 3, 5, 6), 0))
    }
}
