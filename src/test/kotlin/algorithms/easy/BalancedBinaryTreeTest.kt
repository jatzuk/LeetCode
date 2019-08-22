package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test

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

class BalancedBinaryTreeTest {
    val balanced = TreeNode(3).apply {
        left = TreeNode(9)
        right = TreeNode(20).apply {
            left = TreeNode(15)
            right = TreeNode(7)
        }
    }

    val unbalanced = TreeNode(1).apply {
        left = TreeNode(2).apply {
            left = TreeNode(3).apply {
                left = TreeNode(4)
                right = TreeNode(4)
            }
            right = TreeNode(3)
        }
        right = TreeNode(2)
    }

    @Test
    fun isBalancedTest() {
        assertEquals(true, isBalanced(balanced))
        assertEquals(false, isBalanced(unbalanced))
    }
}
