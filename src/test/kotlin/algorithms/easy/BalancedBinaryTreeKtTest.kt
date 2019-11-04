package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test
import util.buildBinaryTreeFromUnsortedArray

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 05.02.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class BalancedBinaryTreeKtTest {
    private val balanced = buildBinaryTreeFromUnsortedArray(arrayOf(3, 9, 20, null, 15, 7))
    private val unbalanced = buildBinaryTreeFromUnsortedArray(arrayOf(1, 2, 2, 3, 3, null, null, 4, 4))

    @Test
    fun isBalancedTest() {
        assertEquals(true, isBalanced(balanced))
        assertEquals(false, isBalanced(unbalanced))
    }
}
