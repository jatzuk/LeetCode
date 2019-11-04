package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test
import util.buildBinaryTreeFromUnsortedArray

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 01.02.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class MaximumDepthOfBinaryTreeKtTest {
    private val tree = buildBinaryTreeFromUnsortedArray(arrayOf(0, 9, 20, null, null, 15, 7))
    private val tree1 = buildBinaryTreeFromUnsortedArray(arrayOf(0, 1, 1, 2, null, 2, null))

    @Test
    fun maxDepthTest() {
        assertEquals(3, maxDepth(tree))
        assertEquals(0, maxDepth(null))
        assertEquals(1, maxDepth(TreeNode(1)))
        assertEquals(2, maxDepth(TreeNode(4).apply { left = TreeNode(2) }))
        assertEquals(3, maxDepth(tree1))
    }
}
