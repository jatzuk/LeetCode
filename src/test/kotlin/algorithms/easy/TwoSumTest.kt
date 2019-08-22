package algorithms.easy

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 13-Dec-18
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

class TwoSumTest {
    @Test
    fun bruteForce() {
        assertArrayEquals(intArrayOf(0, 1), twoSumBruteForce(intArrayOf(2, 7, 11, 15), 9))
    }

    @Test
    fun hashTableTwoPass() {
        assertArrayEquals(intArrayOf(0, 1), twoSumHashMapTwoPass(intArrayOf(2, 7, 11, 15), 9))
    }

    @Test
    fun hashTableSinglePass() {
        assertArrayEquals(intArrayOf(0, 1), twoSumHashMapSinglePass(intArrayOf(2, 7, 11, 15), 9))
    }
}
