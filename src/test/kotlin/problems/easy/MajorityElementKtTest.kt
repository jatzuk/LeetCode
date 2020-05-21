package problems.easy

import org.junit.Assert.assertEquals
import org.junit.Test

/*
 * Created with passion and love 
 *    for project LeetCodePractice
 *        by Jatzuk on 11.09.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class MajorityElementKtTest {
    private val case1 = 3 to intArrayOf(3, 2, 3)
    private val case2 = 2 to intArrayOf(2, 2, 1, 1, 1, 2, 2)

    @Test
    fun majorityElementHashMap() {
        assertEquals(case1.first, majorityElementHashMap(case1.second))
        assertEquals(case2.first, majorityElementHashMap(case2.second))
    }

    @Test
    fun majorityElementSorting() {
        assertEquals(case1.first, majorityElementSorting(case1.second))
        assertEquals(case2.first, majorityElementSorting(case2.second))
    }

    @Test
    fun majorityElementFunctional() {
        assertEquals(case1.first, majorityElementFunctional(case1.second))
        assertEquals(case2.first, majorityElementFunctional(case2.second))
    }
}
