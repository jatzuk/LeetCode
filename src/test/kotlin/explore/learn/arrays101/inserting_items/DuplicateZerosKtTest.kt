package explore.learn.arrays101.inserting_items

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

class DuplicateZerosKtTest {

    private val case1 = intArrayOf(1, 0, 2, 3, 0, 4, 5, 0) to intArrayOf(1, 0, 0, 2, 3, 0, 0, 4)
    private val case2 = intArrayOf(1, 2, 3) to intArrayOf(1, 2, 3)
    private val case3 = intArrayOf(8, 4, 5, 0, 0, 0, 0, 7) to intArrayOf(8, 4, 5, 0, 0, 0, 0, 0)
    private val case4 = intArrayOf(0, 1, 9, 2, 6, 0, 0, 4, 1, 0) to intArrayOf(0, 0, 1, 9, 2, 6, 0, 0, 0, 0)

    @Test
    fun duplicateZerosTest() {
        assertArrayEquals(case1.second, duplicateZeros(case1.first))
        assertArrayEquals(case2.second, duplicateZeros(case2.first))
        assertArrayEquals(case3.second, duplicateZeros(case3.first))
        assertArrayEquals(case4.second, duplicateZeros(case4.first))
    }

    @Test
    fun duplicateZeroesOffsetTest() {
        assertArrayEquals(case1.second, duplicateZeroesOffset(case1.first))
        assertArrayEquals(case2.second, duplicateZeroesOffset(case2.first))
        assertArrayEquals(case3.second, duplicateZeroesOffset(case3.first))
        assertArrayEquals(case4.second, duplicateZeroesOffset(case4.first))
    }
}
