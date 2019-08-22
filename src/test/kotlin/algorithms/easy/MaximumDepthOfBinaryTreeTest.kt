package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test

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

class MaximumDepthOfBinaryTreeTest {
    val tree = TreeNode().apply {
        left = TreeNode(9)
        right = TreeNode(20).apply {
            left = TreeNode(15)
            right = TreeNode(7)
        }
    }

    val tree1 = TreeNode(0).apply {
        left = TreeNode(1).apply { left = TreeNode(2) }
        right = TreeNode(1).apply { left = TreeNode(2).apply { TreeNode(3) } }
    }

    @Test
    fun maxDepthTest() {
        assertEquals(3, maxDepth(tree))
        assertEquals(0, maxDepth(null))
        assertEquals(1, maxDepth(TreeNode(1)))
        assertEquals(2, maxDepth(TreeNode(4).apply { left = TreeNode(2) }))
        assertEquals(3, maxDepth(tree1))
    }
}
