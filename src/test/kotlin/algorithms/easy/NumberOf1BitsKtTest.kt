package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 04.10.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class NumberOf1BitsKtTest {
    private val case1 = 3 to Integer.parseInt("00000000000000000000000000001011", 2)
    private val case2 = 1 to Integer.parseInt("00000000000000000000000010000000", 2)
    private val case3 = 31 to java.lang.Long.parseLong("11111111111111111111111111111101", 2).toInt()

    @Test
    fun hammingWeightNaiveApproach() {
        assertEquals(case1.first, hammingWeightNaive(case1.second))
        assertEquals(case2.first, hammingWeightNaive(case2.second))
        assertEquals(case3.first, hammingWeightNaive(case3.second))
    }

    @Test
    fun hammingWeightMaskApproach() {
        assertEquals(case1.first, hammingWeightMask(case1.second))
        assertEquals(case2.first, hammingWeightMask(case2.second))
        assertEquals(case3.first, hammingWeightMask(case3.second))
    }

    @Test
    fun hammingWeightBitManipulationApproach() {
        assertEquals(case1.first, hammingWeightBitManipulation(case1.second))
        assertEquals(case2.first, hammingWeightBitManipulation(case2.second))
        assertEquals(case3.first, hammingWeightBitManipulation(case3.second))
    }
}
