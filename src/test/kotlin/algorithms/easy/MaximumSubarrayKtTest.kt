package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test

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

class MaximumSubarrayKtTest {
    @Test
    fun maxSubArrayTest() {
        assertEquals(4, maxSubArray(intArrayOf(-2, 1, -3, 4, -1)))
        assertEquals(6, maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
        assertEquals(-1, maxSubArray(intArrayOf(-1)))
    }

    @Test
    fun maxSubArrayTestLinear() {
        assertEquals(4, maxSubArrayLinear(intArrayOf(-2, 1, -3, 4, -1)))
        assertEquals(6, maxSubArrayLinear(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
        assertEquals(-1, maxSubArrayLinear(intArrayOf(-1)))
    }

    @Test
    fun maxSubArrayTestDivideAndConquer() {
        assertEquals(4, maxSubArrayDivideAndConquer(intArrayOf(-2, 1, -3, 4, -1), 0, 4))
        assertEquals(6, maxSubArrayDivideAndConquer(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4), 0, 8))
        assertEquals(-1, maxSubArrayDivideAndConquer(intArrayOf(-1), 0, 0))
    }
}
