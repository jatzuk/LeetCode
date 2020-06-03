package explore.learn.arrays101.inplace

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 03/06/2020
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class MoveZeroesKtTest {

    private val case1 = intArrayOf(0, 1, 0, 3, 12) to intArrayOf(1, 3, 12, 0, 0)
    private val case2 = intArrayOf(0, 1, 0, 3, 0) to intArrayOf(1, 3, 0, 0, 0)

    @Test
    fun moveZeroesNaiveTest() {
        assertArrayEquals(case1.second, moveZeroesNaive(case1.first))
        assertArrayEquals(case2.second, moveZeroesNaive(case2.first))
    }

    @Test
    fun moveZeroesTest() {
        assertArrayEquals(case1.second, moveZeroes(case1.first))
        assertArrayEquals(case2.second, moveZeroes(case2.first))
    }

    @Test
    fun moveZeroesOptimalTest() {
        assertArrayEquals(case1.second, moveZeroesOptimal(case1.first))
        assertArrayEquals(case2.second, moveZeroesOptimal(case2.first))
    }
}
