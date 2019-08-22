package algorithms.easy

import org.junit.Assert.assertEquals
import org.junit.Test

/* 
 * Created with passion and love
 *    for project LeetCodePractice
 *        by Jatzuk on 14.02.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

class PathSumTest {
    val treeT = TreeNode(5).apply {
        left = TreeNode(4).apply {
            left = TreeNode(11).apply {
                left = TreeNode(7)
                right = TreeNode(2)
            }
        }
        right = TreeNode(8).apply {
            left = TreeNode(13)
            right = TreeNode(4).apply {
                right = TreeNode(1)
            }
        }
    }

    val treeN = TreeNode(-2).apply {
        right = TreeNode(-3)
    }

    val treeF = TreeNode(1).apply {
        left = TreeNode(-2)
        right = TreeNode(3)
    }

    val treeF2 = TreeNode(1).apply {
        left = TreeNode(-2).apply {
            left = TreeNode(-3)
            right = TreeNode(1)
        }
        right = TreeNode(3).apply {
            left = TreeNode(-2)
            right = TreeNode(-1)
        }
    }

    @Test
    fun hasPathSumTest() {
        assertEquals(true, hasPathSum(treeT, 22))
        assertEquals(true, hasPathSum(treeN, -5))
        assertEquals(false, hasPathSum(treeF, 3))
        assertEquals(true, hasPathSum(treeF2, 2))
    }
}
