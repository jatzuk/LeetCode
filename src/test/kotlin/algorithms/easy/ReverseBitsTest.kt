package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test

class ReverseBitsTest {
    private val case1 = java.lang.Long.parseLong("00111001011110000010100101000000", 2).toInt() to
            java.lang.Long.parseLong("00000010100101000001111010011100", 2).toInt()

    private val case2 = java.lang.Long.parseLong("10111111111111111111111111111111", 2).toInt() to
            java.lang.Long.parseLong("11111111111111111111111111111101", 2).toInt()

    @Test
    fun reverseNaive() {
        assertEquals(case1.first, reverseBits(case1.second))
        assertEquals(case2.first, reverseBits(case2.second))
    }
}