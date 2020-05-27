package explore.learn.arrays101.deleting

import org.junit.Assert.assertEquals
import org.junit.Test

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 27/05/2020
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class RemoveDuplicatesFromSortedArrayKtTest {

    private val case1 = intArrayOf(1, 1, 2) to 2
    private val case2 = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4) to 5
    private val case3 = intArrayOf() to 0
    private val case4 = intArrayOf(0, 0) to 1

    @Test
    fun removeDuplicatesTest() {
        assertEquals(case1.second, removeDuplicates(case1.first))
        assertEquals(case2.second, removeDuplicates(case2.first))
        assertEquals(case3.second, removeDuplicates(case3.first))
        assertEquals(case4.second, removeDuplicates(case4.first))
    }

    @Test
    fun removeDuplicatesMappedTest() {
        assertEquals(case1.second, removeDuplicatesMapped(case1.first))
        assertEquals(case2.second, removeDuplicatesMapped(case2.first))
        assertEquals(case3.second, removeDuplicatesMapped(case3.first))
        assertEquals(case4.second, removeDuplicatesMapped(case4.first))
    }

}
