package explore.learn.arrays101.searching

import org.junit.Assert.assertEquals
import org.junit.Test

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 5/30/2020
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class ValidMountainArrayKtTest {

    private val case1 = intArrayOf(2, 1) to false
    private val case2 = intArrayOf(3, 5, 5) to false
    private val case3 = intArrayOf(0, 3, 2, 1) to true
    private val case4 = intArrayOf(0, 1, 2, 3, 4, 5, 6, 5, 4, 0) to true
    private val case5 = intArrayOf(0, 7, 6, 5, 4, 3, 2, 1, 0) to true
    private val case6 = intArrayOf(7, 6, 5, 4, 3, 2, 1, 0) to false

    @Test
    fun validMountainArrayTest() {
        assertEquals(case1.second, validMountainArray(case1.first))
        assertEquals(case2.second, validMountainArray(case2.first))
        assertEquals(case3.second, validMountainArray(case3.first))
        assertEquals(case4.second, validMountainArray(case4.first))
        assertEquals(case5.second, validMountainArray(case5.first))
        assertEquals(case6.second, validMountainArray(case6.first))
    }
}
