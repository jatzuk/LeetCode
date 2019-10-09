package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 ** Created with passion and love
 **    for project LeetCodePractice
 **        by Jatzuk on 04.01.2019
 **                                            *_____*
 **                                           *_*****_*
 **                                          *_(O)_(O)_*
 **                                         **____V____**
 **                                         **_________**
 **                                         **_________**
 **                                          *_________*
 **                                           ***___***
 */

class ClimbingStairsKtTest {
    @Test
    fun climbStairsBruteForceTest() {
        assertEquals(2, climbStairsBruteForce(2))
        assertEquals(3, climbStairsBruteForce(3))
        assertEquals(5, climbStairsBruteForce(4))
        assertEquals(8, climbStairsBruteForce(5))
    }

    @Test
    fun climbStairsRecursionMemorizationTest() {
        assertEquals(2, climbStairsRecursionMemorization(2))
        assertEquals(3, climbStairsRecursionMemorization(3))
        assertEquals(5, climbStairsRecursionMemorization(4))
        assertEquals(8, climbStairsRecursionMemorization(5))
    }

    @Test
    fun climbStairsDynamicApproachTest() {
        assertEquals(2, climbStairsDynamicApproach(2))
        assertEquals(3, climbStairsDynamicApproach(3))
        assertEquals(5, climbStairsDynamicApproach(4))
        assertEquals(8, climbStairsDynamicApproach(5))
    }

    @Test
    fun climbStairsFibonacciApproachTest() {
        assertEquals(2, climbStairsFibonacciApproach(2))
        assertEquals(3, climbStairsFibonacciApproach(3))
        assertEquals(5, climbStairsFibonacciApproach(4))
        assertEquals(8, climbStairsFibonacciApproach(5))
    }

    @Test
    fun climbStairsFibonacciFormulaTest() {
        assertEquals(2, climbStairsFibonacciFormula(2))
        assertEquals(3, climbStairsFibonacciFormula(3))
        assertEquals(5, climbStairsFibonacciFormula(4))
        assertEquals(8, climbStairsFibonacciFormula(5))
    }
}
