package algorithms.easy

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

import org.junit.Assert.assertEquals
import org.junit.Test

class ReverseBitsKtTest {
    private val case1 = java.lang.Long.parseLong("00111001011110000010100101000000", 2).toInt() to
            java.lang.Long.parseLong("00000010100101000001111010011100", 2).toInt()

    private val case2 = java.lang.Long.parseLong("10111111111111111111111111111111", 2).toInt() to
            java.lang.Long.parseLong("11111111111111111111111111111101", 2).toInt()

    @Test
    fun reverseBitsTest() {
        assertEquals(case1.first, reverseBits(case1.second))
        assertEquals(case2.first, reverseBits(case2.second))
    }
}
