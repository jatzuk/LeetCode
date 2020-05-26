package explore.learn.arrays101.deleting

import org.junit.Assert.assertEquals
import org.junit.Test

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 26/05/2020
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class RemoveElementKtTest {

    private val case1 = (intArrayOf(3, 2, 2, 3) to 3) to 2
    private val case2 = (intArrayOf(0, 1, 2, 2, 3, 0, 4, 2) to 2) to 5
    private val case3 = (intArrayOf() to 0) to 0
    private val case4 = (intArrayOf(1) to 1) to 0

    @Test
    fun removeElementTest() {
        assertEquals(case1.second, removeElement(case1.first.first, case1.first.second))
        assertEquals(case2.second, removeElement(case2.first.first, case2.first.second))
        assertEquals(case3.second, removeElement(case3.first.first, case3.first.second))
        assertEquals(case4.second, removeElement(case4.first.first, case4.first.second))
    }
}
