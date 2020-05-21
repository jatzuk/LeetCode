package problems.easy

import org.junit.Test
import problems.util.assertTreeEquals
import problems.util.buildBinaryTreeFromUnsortedArray

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 02.02.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class ConvertSortedArrayToBinarySearchTreeKtTest {
    private val expected = buildBinaryTreeFromUnsortedArray(arrayOf(0, -10, 5, null, -3, null, 9))

    @Test
    fun sortedArrayToBSTTest() {
        assertTreeEquals(expected, sortedArrayToBST(intArrayOf(-10, -3, 0, 5, 9)))
    }
}
