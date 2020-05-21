package problems.easy

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

class RemoveDuplicatesFromSortedArrayKtTest {
    @Test
    fun removeDuplicatesTest() {
        assertEquals(2, removeDuplicates(intArrayOf(1, 1, 2)))
        assertEquals(5, removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)))
    }
}
