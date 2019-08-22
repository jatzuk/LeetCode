package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 04-Jan-19
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

class SqrtTest {
    @Test
    fun mySqrtTest() {
        assertEquals(2, mySqrt(4))
        assertEquals(2, mySqrt(8))
        assertEquals(4, mySqrt(16))
        assertEquals(16, mySqrt(256))
        assertEquals(256, mySqrt(65536))
        assertEquals(46340, mySqrt(2147395600))
    }

    @Test
    fun mySqrtNewtonTest() {
        assertEquals(2, mySqrtNewtonAlgorithm(4))
        assertEquals(2, mySqrtNewtonAlgorithm(8))
        assertEquals(4, mySqrtNewtonAlgorithm(16))
        assertEquals(16, mySqrtNewtonAlgorithm(256))
        assertEquals(256, mySqrtNewtonAlgorithm(65536))
        assertEquals(46340, mySqrtNewtonAlgorithm(2147395600))
    }
}
