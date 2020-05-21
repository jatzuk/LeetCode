package problems.easy

import org.junit.Assert.assertEquals
import org.junit.Test

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 04/10/2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class HouseRobberKtTest {
    private val case1 = 4 to intArrayOf(1, 2, 3, 1)
    private val case2 = 12 to intArrayOf(2, 7, 9, 3, 1)
    private val case3 = 18 to intArrayOf(9, 0, 0, 9)

    @Test
    fun robberTest() {
        assertEquals(case1.first, rob(case1.second))
        assertEquals(case2.first, rob(case2.second))
        assertEquals(case3.first, rob(case3.second))
    }
}
