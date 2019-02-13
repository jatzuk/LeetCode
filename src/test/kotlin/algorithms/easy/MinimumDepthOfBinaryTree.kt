package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 13.02.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class MinimumDepthOfBinaryTree {
    val tree2 = TreeNode().apply {
        left = TreeNode()
        right = TreeNode().apply {
            right = TreeNode()
            left = TreeNode()
        }
    }

    val tree1 = TreeNode()
    val tree2Left = TreeNode().apply { left = TreeNode() }
    val tree2Right = TreeNode().apply { right = TreeNode() }

    @Test
    fun minDepthTest() {
        assertEquals(2, minDepth(tree2))
        assertEquals(1, minDepth(tree1))
        assertEquals(0, minDepth(null))
        assertEquals(2, minDepth(tree2Left))
        assertEquals(2, minDepth(tree2Right))
    }
}
