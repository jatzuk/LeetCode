package explore.learn.arrays101.introduction

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 22/05/2020
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class SquaresOfASortedArrayKtTest {

    private val case1 = intArrayOf(-4, -1, 0, 3, 10) to intArrayOf(0, 1, 9, 16, 100)
    private val case2 = intArrayOf(-7, -3, 2, 3, 11) to intArrayOf(4, 9, 9, 49, 121)

    @Test
    fun sortedSquaresTest() {
        assertArrayEquals(case1.second, sortedSquares(case1.first))
        assertArrayEquals(case2.second, sortedSquares(case2.first))
    }

    @Test
    fun sortedSquaresPointersTest() {
        assertArrayEquals(case1.second, sortedSquaresPointers(case1.first))
        assertArrayEquals(case2.second, sortedSquaresPointers(case2.first))
    }
}
