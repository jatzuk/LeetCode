package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test

/*
 * Created with passion and love 
 *    for project LeetCodePractice
 *        by Jatzuk on 03.09.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class SingleNumberTest {
    private val case1 = intArrayOf(2, 2, 1) //1
    private val case2 = intArrayOf(4, 1, 2, 1, 2) //4

    @Test
    fun singleNumberTest() {
        assertEquals(1, singleNumber(case1))
        assertEquals(4, singleNumber(case2))
    }

    @Test
    fun xorTest() {
        assertEquals(1, singleNumberXor(case1))
        assertEquals(4, singleNumberXor(case2))
    }

    @Test
    fun singleNumberFunctional() {
        assertEquals(1, singleNumberFunctional(case1))
        assertEquals(4, singleNumberFunctional(case2))
    }
}
