package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test
import util.buildBinaryTreeFromUnsortedArray

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

class MinimumDepthOfBinaryTreeKtTest {
    private val tree1 = TreeNode()
    private val tree2 = buildBinaryTreeFromUnsortedArray(arrayOf(0, 0, 0, null, null, 0, 0))
    private val tree2Left = TreeNode().apply { left = TreeNode() }
    private val tree2Right = TreeNode().apply { right = TreeNode() }

    @Test
    fun minDepthTest() {
        assertEquals(2, minDepth(tree2))
        assertEquals(1, minDepth(tree1))
        assertEquals(0, minDepth(null))
        assertEquals(2, minDepth(tree2Left))
        assertEquals(2, minDepth(tree2Right))
    }
}
