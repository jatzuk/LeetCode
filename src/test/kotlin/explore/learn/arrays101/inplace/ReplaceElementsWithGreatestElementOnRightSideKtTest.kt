package explore.learn.arrays101.inplace

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 01/06/2020
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class ReplaceElementsWithGreatestElementOnRightSideKtTest {

    private val case1 = intArrayOf(17, 18, 5, 4, 6, 1) to intArrayOf(18, 6, 6, 6, 1, -1)
    private val case2 = intArrayOf(18, 15, 19) to intArrayOf(19, 19, -1)
    private val case3 = intArrayOf(7, 2, -1) to intArrayOf(2, -1, -1)

    @Test
    fun replaceElementsNaiveTest() {
        assertArrayEquals(case1.second, replaceElementsNaive(case1.first))
        assertArrayEquals(case2.second, replaceElementsNaive(case2.first))
        assertArrayEquals(case3.second, replaceElementsNaive(case3.first))
    }

    @Test
    fun replaceElementsTest() {
        assertArrayEquals(case1.second, replaceElements(case1.first))
        assertArrayEquals(case2.second, replaceElements(case2.first))
        assertArrayEquals(case3.second, replaceElements(case3.first))
    }
}
