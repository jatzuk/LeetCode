package explore.learn.arrays101.deleting

import org.junit.Assert.assertEquals
import org.junit.Test

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 28/05/2020
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class CheckIfNAndItsDoubleExistKtTest {

    private val case1 = intArrayOf(10, 2, 5, 3) to true
    private val case2 = intArrayOf(7, 1, 14, 11) to true
    private val case3 = intArrayOf(3, 1, 7, 11) to false

    @Test
    fun checkIfExistMapTest() {
        assertEquals(case1.second, checkIfExistMap(case1.first))
        assertEquals(case2.second, checkIfExistMap(case2.first))
        assertEquals(case3.second, checkIfExistMap(case3.first))
    }

    @Test
    fun checkIfExistSetTest() {
        assertEquals(case1.second, checkIfExistSet(case1.first))
        assertEquals(case2.second, checkIfExistSet(case2.first))
        assertEquals(case3.second, checkIfExistSet(case3.first))
    }

}
