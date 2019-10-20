package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 20/10/2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class ContainsDuplicateKtTest {
    private val case1 = true to intArrayOf(1, 2, 3, 1)
    private val case2 = false to IntArray(4) { it + 1 }
    private val case3 = true to intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)

    @Test
    fun containsDuplicate() {
        assertEquals(case1.first, containsDuplicate(case1.second))
        assertEquals(case2.first, containsDuplicate(case2.second))
        assertEquals(case3.first, containsDuplicate(case3.second))
    }

    @Test
    fun containsDuplicateSorting() {
        assertEquals(case1.first, containsDuplicateSorting(case1.second))
        assertEquals(case2.first, containsDuplicateSorting(case2.second))
        assertEquals(case3.first, containsDuplicateSorting(case3.second))
    }
}
