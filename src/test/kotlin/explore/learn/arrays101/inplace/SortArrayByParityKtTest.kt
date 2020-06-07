package explore.learn.arrays101.inplace

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 07/06/2020
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class SortArrayByParityKtTest {

    private val case1 = intArrayOf(3, 1, 2, 4) to intArrayOf(4, 2, 1, 3)
    private val case2 = intArrayOf(3, 7, 5, 4, 2, 9, 1) to intArrayOf(2, 4, 5, 7, 3, 9, 1)
    private val case3 = intArrayOf(0, 1, 2) to intArrayOf(0, 2, 1)

    @Test
    fun sortArrayByParityTest() {
        assertArrayEquals(case1.second, sortArrayByParityInPlace(case1.first))
        assertArrayEquals(case2.second, sortArrayByParityInPlace(case2.first))
        assertArrayEquals(case3.second, sortArrayByParityInPlace(case3.first))
    }

    @Test
    fun sortArrayByParityAdditionalArrayTest() {
        println(sortArrayByParityAdditionalArray(case1.first).contentToString())
        println(sortArrayByParityAdditionalArray(case2.first).contentToString())
        println(sortArrayByParityAdditionalArray(case3.first).contentToString())
    }

    @Test
    fun sortArrayByParitySortComparingTest() {
        println(sortArrayByParitySortComparing(case1.first).contentToString())
        println(sortArrayByParitySortComparing(case2.first).contentToString())
        println(sortArrayByParitySortComparing(case3.first).contentToString())
    }
}
