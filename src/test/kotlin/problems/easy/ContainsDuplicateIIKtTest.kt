package problems.easy

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

class ContainsDuplicateIIKtTest {
    private val case1 = true to (intArrayOf(1, 2, 3, 1) to 3)
    private val case2 = true to (intArrayOf(1, 0, 1, 1) to 1)
    private val case3 = false to (intArrayOf(1, 2, 3, 1, 2, 3) to 2)
    private val case4 = true to (intArrayOf(1, 1) to 2)

    @Test
    fun containsNearbyDuplicate() {
        assertEquals(case1.first, containsNearbyDuplicate(case1.second.first, case1.second.second))
        assertEquals(case2.first, containsNearbyDuplicate(case2.second.first, case2.second.second))
        assertEquals(case3.first, containsNearbyDuplicate(case3.second.first, case3.second.second))
        assertEquals(case4.first, containsNearbyDuplicate(case4.second.first, case4.second.second))
    }
}
