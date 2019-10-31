package algorithms.easy

import org.junit.Test

import org.junit.Assert.*

/*
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 28/10/2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class LowestCommonAncestorOfABinarySearchTreeKtTest {
    private val tree = TreeNode(6).apply {
        left = TreeNode(2).apply {
            left = TreeNode(0)
            right = TreeNode(4).apply {
                left = TreeNode(3)
                right = TreeNode(5)
            }
        }
        right = TreeNode(8).apply {
            left = TreeNode(7)
            right = TreeNode(9)
        }
    }

    private val tree1 = TreeNode(2).apply {
        left = TreeNode(1)
        right = TreeNode(3)
    }

    private val tree2 = TreeNode(3).apply {
        left = TreeNode(1)
        right = TreeNode(4).apply {
            left = TreeNode(2)
        }
    }

    @Test
    fun lowestCommonAncestor() {
        assertEquals(6,
                lowestCommonAncestor(tree, TreeNode(2), TreeNode(8)).value
        )
        assertEquals(2,
                lowestCommonAncestor(tree, TreeNode(2), TreeNode(4)).value
        )
        assertEquals(8,
                lowestCommonAncestor(tree, TreeNode(7), TreeNode(9)).value
        )
        assertEquals(4,
                lowestCommonAncestor(tree, TreeNode(3), TreeNode(5)).value
        )
        assertEquals(2,
                lowestCommonAncestor(tree1, TreeNode(1), TreeNode(3)).value
        )
        assertEquals(3,
                lowestCommonAncestor(tree2, TreeNode(2), TreeNode(3)).value
        )
    }

    @Test
    fun lowestCommonAncestorIterative() {
        assertEquals(6,
                lowestCommonAncestorIterative(tree, TreeNode(2), TreeNode(8)).value
        )
        assertEquals(2,
                lowestCommonAncestorIterative(tree, TreeNode(2), TreeNode(4)).value
        )
        assertEquals(8,
                lowestCommonAncestorIterative(tree, TreeNode(7), TreeNode(9)).value
        )
        assertEquals(4,
                lowestCommonAncestorIterative(tree, TreeNode(3), TreeNode(5)).value
        )
        assertEquals(2,
                lowestCommonAncestorIterative(tree1, TreeNode(1), TreeNode(3)).value
        )
        assertEquals(3,
                lowestCommonAncestorIterative(tree2, TreeNode(2), TreeNode(3)).value
        )
    }
}
