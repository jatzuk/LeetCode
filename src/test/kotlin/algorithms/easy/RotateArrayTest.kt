package algorithms.easy

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/*
 * Created with passion and love 
 *    for project LeetCodePractice
 *        by Jatzuk on 18.09.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class RotateArrayTest {
    private val case1 = intArrayOf(1, 2, 3, 4, 5, 6, 7) to 3
    private val case2 = intArrayOf(-1, -100, 3, 99) to 2

    @Test
    fun naiveApproach() {
        assertArrayEquals(intArrayOf(5, 6, 7, 1, 2, 3, 4), rotateNaive(case1.first, case1.second))
        assertArrayEquals(intArrayOf(3, 99, -1, -100), rotateNaive(case2.first, case2.second))
    }
}
