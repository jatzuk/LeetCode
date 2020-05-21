package problems.easy

import org.junit.Assert.assertEquals
import org.junit.Test

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 24/10/2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class PowerOfTwoKtTest {

    @Test
    fun isPowerOfTwoNaive() {
        assertEquals(true, isPowerOfTwoNaive(4))
        assertEquals(false, isPowerOfTwoNaive(5))
        assertEquals(false, isPowerOfTwoNaive(218))
        assertEquals(true, isPowerOfTwoNaive(1024))
    }

    @Test
    fun isPowerOfTwoBitCount() {
        assertEquals(true, isPowerOfTwoBitCount(4))
        assertEquals(true, isPowerOfTwoBitCount(1024))
        assertEquals(false, isPowerOfTwoBitCount(5))
        assertEquals(false, isPowerOfTwoBitCount(218))
        assertEquals(false, isPowerOfTwoBitCount(-256))
    }

    @Test
    fun isPowerOfTwoIterative() {
        assertEquals(true, isPowerOfTwoIterative(4))
        assertEquals(true, isPowerOfTwoIterative(1024))
        assertEquals(false, isPowerOfTwoIterative(5))
        assertEquals(false, isPowerOfTwoIterative(218))
        assertEquals(false, isPowerOfTwoIterative(-256))
    }

    @Test
    fun isPowerOfTwoRecursive() {
        assertEquals(true, isPowerOfTwoRecursive(4))
        assertEquals(true, isPowerOfTwoRecursive(1024))
        assertEquals(false, isPowerOfTwoRecursive(5))
        assertEquals(false, isPowerOfTwoRecursive(218))
        assertEquals(false, isPowerOfTwoRecursive(-256))
    }

    @Test
    fun isPowerOfTwoBitwise() {
        assertEquals(true, isPowerOfTwoBitwise(4))
        assertEquals(true, isPowerOfTwoBitwise(1024))
        assertEquals(false, isPowerOfTwoBitwise(5))
        assertEquals(false, isPowerOfTwoBitwise(218))
        assertEquals(false, isPowerOfTwoBitwise(-256))
    }
}
